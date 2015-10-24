package aulajavaweb.model;

public class Animal implements Model {

	public enum Especie {
	}
	
	public enum Raca {
	}
	
	public enum Sexo {
	}
	
	public enum Temperamento {
	}
	
	Integer id;
	Especie especie;
	Raca raca;
	Sexo sexo;
	Integer meses;
	Temperamento temperamento;
	String pelagem;
	// em gramas
	Integer peso;
	HistoricoMedico historicoMedico;	
	
	@Override
	public Integer getId() {
		return id;
	}
	
}
