package aulajavaweb.persistence.dao;

import java.util.List;

import aulajavaweb.model.HistoricoMedico;

public class HistoricoMedicoDao implements Dao<HistoricoMedico> {

	private static HistoricoMedicoDao dao = HistoricoMedicoDao.singleton();
	
	private HistoricoMedicoDao() {
	}
	
	public static HistoricoMedicoDao singleton(){
		return dao == null ? new HistoricoMedicoDao() : dao;
	}

	@Override
	public void inserir(HistoricoMedico t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Integer t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HistoricoMedico buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HistoricoMedico> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(HistoricoMedico t) {
		// TODO Auto-generated method stub
		
	}
	
	
}
