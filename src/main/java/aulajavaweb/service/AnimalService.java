package aulajavaweb.service;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class AnimalService extends Service {

	protected AnimalService(URL wsdlDocumentLocation, QName serviceName) {
		super(wsdlDocumentLocation, serviceName);
		// TODO Auto-generated constructor stub
	}
//	private AnimalDao dao  = new AnimalDao();
//	private AnimalValidador validador = new AnimalValidador();

}
