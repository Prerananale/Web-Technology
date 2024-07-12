package struts2;
import com.opensymphony.xwork2.ActionSupport;
public class RegisterAction extends ActionSupport {
    private String username="";
private String password="";
private String confirmPassword="";
private String email="";
private String mobile="";
    public String getConfirmPassword() {
        return confirmPassword;
    }
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public RegisterAction() {
    }
    public String execute() throws Exception {
       // do the required process
        return "success";
    }
}