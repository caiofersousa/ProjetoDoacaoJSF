package aulajavaweb.persistence.dao;

import java.util.List;

import aulajavaweb.model.Tutor;

public class TutorDao implements Dao<Tutor> {
	
	private static TutorDao dao = TutorDao.singleton();
	
	private TutorDao() {
	}
	
	
	private static TutorDao singleton(){
		return dao == null ? new TutorDao() : dao;
	}


	@Override
	public void inserir(Tutor t) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void excluir(Integer t) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Tutor buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Tutor> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void atualizar(Tutor t) {
		// TODO Auto-generated method stub
		
	}

}
