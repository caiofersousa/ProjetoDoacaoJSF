package aulajavaweb.bean;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import aulajavaweb.model.Animal;
import aulajavaweb.persistence.dao.AnimalDao;
/**
 * 
 * @author Caio Fernando de Sousa
 *
 */
@ManagedBean
@ApplicationScoped
public class AnimalBean implements Bean<Animal>{
	
	private Animal animal = new Animal();
	private AnimalDao dao = AnimalDao.singleton();
	
	public AnimalBean(){
		
	}
	
	

	
	public Animal getAnimal(){
		return animal;
	}
	
	public void setAnimal(Animal animal){
		this.animal = animal;
	}


	@Override
	public void inserir(Animal t) {
		dao.inserir(t);
	}




	@Override
	public void excluir(Animal t) {
		dao.excluir(t.getId());
	}




	@Override
	public Animal buscar(Integer id) {
		dao.buscar(id);
		return null;
	}




	@Override
	public List<Animal> buscarTodos() {
		dao.buscarTodos();
		return null;
	}




	@Override
	public void atualizar(Animal t) {
		dao.atualizar(t);
			
	}




	

}
