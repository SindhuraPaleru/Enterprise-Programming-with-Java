package beanpack;
/** * * @author sindh */
public class BeanClass{
    private String tbname=null;
    private String branch=null;
    private String section=null;
    private String gender=null;
    private String tbun=null;
    private String tbpwd=null;
    private String tbcgpa=null;
    private String tbregd=null;
    
    public BeanClass(){}
    public String getTbname(){
        return tbname;
    }
    public String getTbregd(){
        return tbregd;
    }
    public String getTbcgpa(){
        return tbcgpa;
    }
    public String getBranch(){
        return branch;
    }
    public String getSection(){
        return section;
    }
    public String getGender(){
        return gender;
    }
    public String getTbun(){
        return tbun;
    }
    public String getTbpwd(){
        return tbpwd;
    }
    public void setTbname(String tbname){
      this.tbname = tbname;
    }
    public void setBranch(String branch){
      this.branch = branch;
    }
    public void setTbregd(String tbregd){
        this.tbregd=tbregd;
    }
    public void setTbcgpa(String tbcgpa){
        this.tbcgpa=tbcgpa;
    }
    public void setSection(String section){
      this.section = section;
    }
    public void setGender(String gender){
      this.gender = gender;
    }
    public void setTbun(String tbun){
      this.tbun = tbun;
    }
    public void setTbpwd(String tbpwd){
      this.tbpwd= tbpwd;
    }
}
