package aulajavaweb.persistence.dao;

import java.util.List;

import aulajavaweb.model.Endereco;

public class EnderecoDao implements Dao<Endereco> {
	
	
	private static EnderecoDao dao = EnderecoDao.singleton();
	
	
	private EnderecoDao() {
	}


	private static EnderecoDao singleton(){
		return dao == null ? new EnderecoDao() : dao;
	}
	
	
	
	@Override
	public void inserir(Endereco t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Integer t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Endereco buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Endereco> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Endereco t) {
		// TODO Auto-generated method stub
		
	}

}
