package struts2;
import com.opensymphony.xwork2.ActionSupport;

public class MobileValidationAction extends ActionSupport {
    private String mobileNumber;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

   public void validate() {
        if (mobileNumber == null || mobileNumber.trim().isEmpty()) {
            addFieldError("mobileNumber", "Mobile number is required.");
        } else if (!mobileNumber.matches("\\d{10}")) {
            addFieldError("mobileNumber", "Invalid mobile number. Please enter 10 digits.");
        }
    }

    public String execute() {
        // Your action logic here
        return SUCCESS;
    }
}