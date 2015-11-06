package aulajavaweb.persistence.dao;

import java.util.ArrayList;
import java.util.List;

import aulajavaweb.model.Vacina;

public class VacinaDao implements Dao<Vacina> {

	private static VacinaDao dao ;
	private List<Vacina> vacinas = new ArrayList<>();
	
	
	
	private VacinaDao() {
	}

	@Override
	public void inserir(Vacina t) {
		vacinas.add(t);
	}

	@Override
	public void excluir(Integer t) {
		vacinas.remove(t);
	}

	@Override
	public Vacina buscar(Integer id) {
		vacinas.get(id);
		return null;
	}

	@Override
	public List<Vacina> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Vacina t) {
		// TODO Auto-generated method stub
		
	}
	
}
