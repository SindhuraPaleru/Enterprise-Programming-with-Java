package aaa;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
/**
 *
 * @author sindh
 */
@FacesConverter("emailconv")
public class EmailConv implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if(value.contains("@gmail.com"))
            return value;
        else
            return value+"@gmail.com";
    }
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }
}
