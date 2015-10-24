package aulajavaweb.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class HistoricoMedico {

	private boolean castrado;
	private List<String> doencasCronicas;
	private List<String> cirurgias;
	private AnimalVacina animalVacina;
	private AnimalVermifugo animalVermifugo;
	
	private HistoricoMedico(Builder b) {
		castrado = b.castrado;
		doencasCronicas = b.doencasCronicas;
		cirurgias = b.cirurgias;
		animalVacina = b.animalVacina;
		animalVermifugo = b.animalVermifugo;
	}
	
	public HistoricoMedico(boolean castrado,
			List<String> doencasCronicas,
			List<String> cirurgias,
			AnimalVacina animalVacina,
			AnimalVermifugo animalVermifugo) {
				
			}
	
	public boolean isCastrado() {
		return castrado;
	}

	public List<String> getDoencasCronicas() {
		return doencasCronicas;
	}

	public List<String> getCirurgias() {
		return cirurgias;
	}

	public AnimalVacina getAnimalVacina() {
		return animalVacina;
	}

	public AnimalVermifugo getAnimalVermifugo() {
		return animalVermifugo;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		
		private boolean castrado;
		private List<String> doencasCronicas;
		private List<String> cirurgias;
		private AnimalVacina animalVacina;
		private AnimalVermifugo animalVermifugo;
		
		private Builder() {
		}
		
		
		
		public Builder castrado(boolean castrado) {
			this.castrado = castrado;
			return this;
		}
		
		public Builder doencasCronicas(List<String> doencasCronicas) {
			this.doencasCronicas = doencasCronicas;
			return this;
		}
		
		public Builder cirurgias(List<String> cirurgias) {
			this.cirurgias = cirurgias;
			return this;
		}
		
		public Builder animalVacina(AnimalVacina animalVacina) {
			this.animalVacina = animalVacina;
			return this;
		}
		
		public Builder animalVermifugo(AnimalVermifugo animalVermifugo) {
			this.animalVermifugo = animalVermifugo;
			return this;
		}
		
		public HistoricoMedico build() {
			return new HistoricoMedico(this);
		}
		
	}
	
	
	
}
