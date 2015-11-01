package retailstore;
// Generated Nov 1, 2015 11:23:18 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Purchases generated by hbm2java
 */
public class Purchases  implements java.io.Serializable {


     private int id;
     private Date createdAt;
     private Set purchaseItemses = new HashSet(0);

    public Purchases() {
    }

	
    public Purchases(int id) {
        this.id = id;
    }
    public Purchases(int id, Date createdAt, Set purchaseItemses) {
       this.id = id;
       this.createdAt = createdAt;
       this.purchaseItemses = purchaseItemses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Set getPurchaseItemses() {
        return this.purchaseItemses;
    }
    
    public void setPurchaseItemses(Set purchaseItemses) {
        this.purchaseItemses = purchaseItemses;
    }




}


