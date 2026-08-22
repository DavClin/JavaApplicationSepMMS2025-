
package hospital.models;

public class InvoiceItem {
       private int id;
    private Invoice invoice;
    private String decription;
    private int quantity;
     private double unitPrice;
    private double amount;
    
    public InvoiceItem() {
    
    }

    public int getId() {
        return id;
    }


    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double calculateAmount() {
        this.amount = quantity * unitPrice;
           return 0;
    }
  
    
}
