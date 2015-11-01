package retailstore;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Category  implements java.io.Serializable {

     private int id;
     private String name;
     private Date createdAt;
     private Set productses = new HashSet(0);

    public Category() {
    }
	
    public Category(int id) {
        this.id = id;
    }
    public Category(int id, String name, Date createdAt, Set productses) {
       this.id = id;
       this.name = name;
       this.createdAt = createdAt;
       this.productses = productses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Set getProductses() {
        return this.productses;
    }
    
    public void setProductses(Set productses) {
        this.productses = productses;
    }
}
