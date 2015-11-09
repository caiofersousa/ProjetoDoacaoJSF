package aulajavaweb.persistence.dao;

import java.util.List;

import aulajavaweb.model.AnimalVermifugo;
import aulajavaweb.model.Model;

public interface Dao<T extends Model>  {

	void inserir(T t);
	
	void excluir(T t) ;
	
	T buscar(Integer id);
	
	List<T> buscarTodos();
	
	void atualizar(T t);

	
}
