package aulajavaweb.util;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.xml.bind.ValidationException;

@FacesValidator("telefoneValidador")
public class ValidadorTelefone {
	
	public void validate(FacesContext context,  UIComponent component, Object value) throws ValidationException{
		
		String telefone = (String)value;
		
		if(telefone.replaceAll("[0-9]", "").length() > 0){
			((UIInput) component).setValid(false);
			FacesMessage message = new FacesMessage("Telefone Inválido.");
			message.setSeverity(FacesMessage.SEVERITY_WARN);
			context.addMessage(component.getClientId(context), message);
			throw new ValidationException(message.toString());
		}
		
	}
	

}
