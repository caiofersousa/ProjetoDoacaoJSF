package aulajavaweb.bean;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import aulajavaweb.model.Endereco;
import aulajavaweb.model.Tutor;
import aulajavaweb.model.enums.TipoTutor;
import aulajavaweb.persistence.dao.EnderecoDao;
import aulajavaweb.persistence.dao.TutorDao;
@ApplicationScoped
@ManagedBean
public class TutorBean  {
	
private Tutor tutor = new Tutor();
	
	public TutorBean() {
	}
	
	public String cadastrar() {
		TutorDao.singleton().cadastrar(tutor);
		return "";
	}
	
	public Tutor getTutor() {
		return tutor;
	}
	
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public List<Tutor> getTutores() {
		return TutorDao.singleton().getTutores();
	}
	
	public List<Endereco> getEnderecos() {
		return EnderecoDao.singleton().getEnderecos();
	}
	
	public TipoTutor[] getTipos() {
		return TipoTutor.values();
	}
	
	

}
