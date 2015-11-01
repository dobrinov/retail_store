package retailstore;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Purchase  implements java.io.Serializable {

     private int id;
     private Date createdAt;
     private Set purchaseItems = new HashSet(0);

    public Purchase() {
    }
	
    public Purchase(int id) {
        this.id = id;
    }

    public Purchase (int id, Date createdAt, Set purchaseItems) {
       this.id = id;
       this.createdAt = createdAt;
       this.purchaseItems = purchaseItems;
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
    public Set getPurchaseItems() {
        return this.purchaseItems;
    }
    
    public void setPurchaseItems(Set purchaseItems) {
        this.purchaseItems = purchaseItems;
    }
}


