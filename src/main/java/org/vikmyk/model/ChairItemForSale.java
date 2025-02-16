package org.vikmyk.model;

import java.math.BigDecimal;

public final class ChairItemForSale extends ProductItemForSale {

    public ChairItemForSale() {
        super("Reading Chair", BigDecimal.valueOf(200.0), "This chair was manufactured in Estonia");
    }

    @Override
    public void showDetails() {
        System.out.println(this.description);
        printPricedItem();
        System.out.println(this.type);
    }

    @Override
    public String toString() {
        return "chair";
    }
}
