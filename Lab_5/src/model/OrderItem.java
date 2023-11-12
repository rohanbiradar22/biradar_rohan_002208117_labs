/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rohan
 */
public class OrderItem {
    Product product;
    double salesProce;
    int  quantity;

    public OrderItem(Product product, double salesProce, int quantity) {
        this.product = product;
        this.salesProce = salesProce;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getSalesPrice() {
        return salesProce;
    }

    public void setSalesProce(double salesProce) {
        this.salesProce = salesProce;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public  String toString(){
        return this.product.toString();
    }
    
    
    
}
