package aulajavaweb.persistence.dao;

import java.util.List;

import aulajavaweb.model.Model;

public interface Dao<T extends Model>  {

	void inserir(T t);
	
	void excluir(Integer t) ;
	
	T buscar(Integer id);
	
	List<T> buscarTodos();
	
	void atualizar(T t);
	
}
