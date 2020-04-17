package aaa;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;
import javax.faces.convert.Converter;
/**
 *
 * @author sindh
 */
@FacesConverter("mobileconv")
public class MobileConv implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if(value.contains("+91"))
            return value;
        else
            return "+91"+value;
    }
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }  
}
