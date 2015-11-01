package retailstore;

import java.util.Date;

public class User  implements java.io.Serializable {

     private int id;
     private String username;
     private String password;
     private Boolean admin;
     private Date createdAt;

    public User() {
    }
	
    public User(int id) {
        this.id = id;
    }
    public User(int id, String username, String password, Boolean admin, Date createdAt) {
       this.id = id;
       this.username = username;
       this.password = password;
       this.admin = admin;
       this.createdAt = createdAt;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean getAdmin() {
        return this.admin;
    }
    
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
