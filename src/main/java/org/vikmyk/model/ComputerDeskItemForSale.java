package org.vikmyk.model;

import java.math.BigDecimal;

public final class ComputerDeskItemForSale extends ProductItemForSale {
    public ComputerDeskItemForSale() {
        super("Computer Desk", BigDecimal.valueOf(100.0), "This desk was manufactured in Estonia");
    }

    @Override
    public void showDetails() {
        System.out.println(this.description);
        printPricedItem();
        System.out.println(this.type);
    }

    @Override
    public String toString() {
        return "computer";
    }
}
