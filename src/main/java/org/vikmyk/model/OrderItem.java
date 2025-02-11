package org.vikmyk.model;

public class OrderItem {

    Integer quantity;
    ProductForSale productForSale;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ProductForSale getProductForSale() {
        return productForSale;
    }

    public void setProductForSale(ProductForSale productForSale) {
        this.productForSale = productForSale;
    }
}
