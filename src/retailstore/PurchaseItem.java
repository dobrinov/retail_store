package retailstore;

import java.util.Date;

public class PurchaseItem implements java.io.Serializable {

     private int id;
     private Product product;
     private Purchase purchase;
     private int quantity;
     private Date createdAt;

    public PurchaseItem() {
    }

    public PurchaseItem(int id, Product product, Purchase purchase, int quantity) {
        this.id = id;
        this.product = product;
        this.purchase = purchase;
        this.quantity = quantity;
    }

    public PurchaseItem(int id, Product product, Purchase purchase, int quantity, Date createdAt) {
       this.id = id;
       this.product = product;
       this.purchase = purchase;
       this.quantity = quantity;
       this.createdAt = createdAt;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

    public Purchase getPurchases() {
        return this.purchase;
    }
    
    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
