package aulajavaweb.persistence.dao;

import java.util.ArrayList;
import java.util.List;

import aulajavaweb.model.AnimalVacina;

public class AnimalVacinaDao implements Dao<AnimalVacina> {

	
	private static AnimalVacinaDao dao;
	
	private List<AnimalVacina> animalVacinas  = new ArrayList<AnimalVacina>();
	

	private AnimalVacinaDao() {
	}

	public static AnimalVacinaDao singleton(){
		return dao  == null ? new AnimalVacinaDao() : dao;
	}
	
	public List<AnimalVacina> getAnimalVacinas(){
		return animalVacinas;
	}
	
	
	@Override
	public void inserir(AnimalVacina t) {
		animalVacinas.add(t);
	}

	@Override
	public void excluir(AnimalVacina t) {
		animalVacinas.remove(t);
	}

	@Override
	public AnimalVacina buscar(Integer id) {
		animalVacinas.get(id);
		return null;
	}

	@Override
	public List<AnimalVacina> buscarTodos() {
//		animalVacinas.get(index)
		return null;
	}

	@Override
	public void atualizar(AnimalVacina t) {
		animalVacinas.remove(t.getId());
		animalVacinas.add(t);
	}

	
}
