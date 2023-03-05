/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author
 */
public class OrderItem {

    private Medicine drug;
    private int quantity;
    private int salesPrice;

    @Override
    public String toString() {
        return drug.getDrugName();
    }

    public Medicine getDrug() {
        return drug;
    }

    public void setDrug(Medicine drug) {
        this.drug = drug;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }
    
}
