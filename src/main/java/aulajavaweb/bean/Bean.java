package aulajavaweb.bean;

import java.util.List;
/**
 * 
 * @author Caio Fernando de Sousa
 *
 * @param <T>
 */
public interface Bean<T> {
	
	public void inserir(T t);
	
	public void excluir(T t);
	
	public T buscar(Integer id);
	
	public List<T> buscarTodos();
	
	public void atualizar(T t);

}
