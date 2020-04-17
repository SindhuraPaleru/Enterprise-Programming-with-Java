package aaa;
import java.io.File;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.validator.ValidatorException;
import javax.servlet.ServletContext;
import javax.servlet.http.Part;
/**
 *
 * @author sindh
 */
@ManagedBean(name = "mb")
@ApplicationScoped
public class mybean {
    private String name;
    private String regdno;
    private String year;
    private String branch;
    private String email;
    private String mobile;
    private String state="TamilNadu";
    private String[] district;
    private String selectDistrict;
    private Part fileUp;
    private String fileName;
    public Part getFileUp() 
    {
        return fileUp;
    }
    public void setFileUp(Part uploadedPart)
    {
        this.fileUp=uploadedPart;
    }
    public void setFileName(){
        this.fileName=fileName;
    }
    public String getFileName()
    {
        return fileName;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String[] getDistrict() {
        if(state.equals("AndhraPradesh"))
        {
            String[] temp={"Guntur","Nellore","Krishna","Prakasam","Chittore","Kadapa","Srikakulam","WestGodavari","East Godavari","Ananthapur","Visakhapatnam","Vijayanagaram","Kurnool"};
            district=temp;
        }
        else if(state.equals("TamilNadu"))
        {
            String[] temp={"Thanjavur","Tiruchirappalli","Perambalur","Tiruppur","Thoothukudi","Kanyakumari"};
            district=temp;
        }
        return district;
    }
    public void setDistrict(String[] district) {
        this.district = district;
    }
    public String getSelectDistrict() {
        return selectDistrict;
    }
    public void setSelectDistrict(String selectDistrict) {
        this.selectDistrict = selectDistrict;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getRegdno() {
        return regdno;
    }
    public void setRegdno(String regdno) {
        this.regdno = regdno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public mybean() {
    }
    public void changeStateEvent(ValueChangeEvent e)
    {
        state=e.getNewValue().toString();
    }
    public void changeFileEvent(ValueChangeEvent e)
    {
        fileUp=(Part) e.getNewValue();
        fileName = fileUp.getSubmittedFileName();
    }  
}
