package struts2;
public class HelloWorldAction {
   private String name, mob, email;

   public String execute() throws Exception {
      if(name.equals("")||mob.equals("")||email.equals(""))
      return "error";
      else
      return "success";
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

public String getMob() {
      return mob;
   }

   public void setMob(String mob) {
      this.mob = mob;
   }

public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
}