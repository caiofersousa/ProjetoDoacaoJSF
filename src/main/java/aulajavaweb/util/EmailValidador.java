package aulajavaweb.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;


@FacesValidator("emailValidador")
public class EmailValidador implements Validator{
	
	public void validate(FacesContext context , UIComponent component, Object value) {
		String email = (String) value;
		if(email.indexOf('@')==-1){
			((UIInput) component).setValid(false);
			FacesMessage message = new FacesMessage("Email Inválido");
//			message.setSeverity(FacesMessage.SEVERITY_WARN);
			context.addMessage(component.getClientId(context), message);
//			throw new ValidationException(message);
		}
	}
	
	
	

}
