package aaa;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
/**
 *
 * @author sindh
 */
@FacesValidator("emailvalidate")
public class EmailValidate implements Validator{
    @Override
public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        		String emailid=value.toString();
if(emailid.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-	Z]{2,5})$")||emailid.matches("^([a-zA-Z0-9_\\-\\.]+)")){  }
        		else
        		{
          			  FacesMessage fm=new FacesMessage("Invalid Mail ID");
            		throw new ValidatorException(fm);
        		}
    	}
}
