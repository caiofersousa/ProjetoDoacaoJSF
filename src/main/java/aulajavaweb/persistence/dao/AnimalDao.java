package aulajavaweb.persistence.dao;

import java.util.ArrayList;
import java.util.List;

import aulajavaweb.model.Animal;
/***
 * 
 * @author Caio Fernando de Sousa
 * Exemplo de singletom
 *
 */
public class AnimalDao implements Dao<Animal> {

	private static AnimalDao dao;
	
	
	private List<Animal> animais = new ArrayList<Animal>();
	
	private AnimalDao() {
	}
	
	/**
	 * Se o dao for nulo estanciar o Animal Dao se ano usar o Dao existente
	 * @return
	 */
	public static AnimalDao singleton(){
		return dao == null ? new AnimalDao() : dao;
	}
	
	public List<Animal> getAnimais(){
		return animais;
	}

	@Override
	public void inserir(Animal t) {
		animais.add(t);
		
	}

	@Override
	public void excluir(Integer t) {
		animais.remove(t);
	}

	@Override
	public Animal buscar(Integer id) {
		return animais.get(id);
	}

	@Override
	public List<Animal> buscarTodos() {
		return null;
	}

	@Override
	public void atualizar(Animal t) {
		animais.remove(t);
		animais.add(t);
	}
	
	
}
