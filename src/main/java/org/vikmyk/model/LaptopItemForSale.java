package org.vikmyk.model;

import java.math.BigDecimal;

public final class LaptopItemForSale extends ProductItemForSale {

    public LaptopItemForSale() {
        super("Laptop", BigDecimal.valueOf(900.0), "This laptop is a modern computer");
    }

    @Override
    public void showDetails() {
        System.out.println(this.description);
        printPricedItem();
        System.out.println(this.type);
    }

    @Override
    public String toString() {
        return "laptop";
    }
}
