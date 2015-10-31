package retailstore;
// Generated Oct 31, 2015 10:17:02 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Categories generated by hbm2java
 */
public class Categories  implements java.io.Serializable {


     private int id;
     private Categories categories;
     private String name;
     private Date createdAt;
     private Set productses = new HashSet(0);
     private Set categorieses = new HashSet(0);

    public Categories() {
    }

	
    public Categories(int id) {
        this.id = id;
    }
    public Categories(int id, Categories categories, String name, Date createdAt, Set productses, Set categorieses) {
       this.id = id;
       this.categories = categories;
       this.name = name;
       this.createdAt = createdAt;
       this.productses = productses;
       this.categorieses = categorieses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Categories getCategories() {
        return this.categories;
    }
    
    public void setCategories(Categories categories) {
        this.categories = categories;
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
    public Set getCategorieses() {
        return this.categorieses;
    }
    
    public void setCategorieses(Set categorieses) {
        this.categorieses = categorieses;
    }




}

