package org.vikmyk.model;

import java.math.BigDecimal;

public abstract class ProductForSale extends ProductItem {

    String type;

    String description;

    BigDecimal price;

    public ProductForSale(String type, BigDecimal price, String description) {
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public BigDecimal getSalesPrice() {
        return this.price;
    }

    public void printPricedItem() {

    }

    abstract void showDetails() ;
}
