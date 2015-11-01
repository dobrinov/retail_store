package retailstore;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Product  implements java.io.Serializable {

     private int id;
     private Category category;
     private String name;
     private String barcode;
     private Date createdAt;
     private Set purchaseItems = new HashSet(0);

    public Product() {
    }
	
    public Product(int id, String name, String barcode) {
        this.id = id;
        this.name = name;
        this.barcode = barcode;
    }
    public Product(int id, Category category, String name, String barcode, Date createdAt, Set purchaseItems) {
       this.id = id;
       this.category = category;
       this.name = name;
       this.barcode = barcode;
       this.createdAt = createdAt;
       this.purchaseItems = purchaseItems;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Category getCategories() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getBarcode() {
        return this.barcode;
    }
    
    public void setBarcode(String barcode) {
        this.barcode = barcode;
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
