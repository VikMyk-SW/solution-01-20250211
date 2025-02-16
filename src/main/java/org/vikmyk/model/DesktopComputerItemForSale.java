package org.vikmyk.model;

import java.math.BigDecimal;

public final class DesktopComputerItemForSale extends ProductItemForSale {

    public DesktopComputerItemForSale() {
        super("Desktop Computer", BigDecimal.valueOf(700.0), "This desktop is a modern computer");
    }

    @Override
    public void showDetails() {
        System.out.println(this.description);
        printPricedItem();
        System.out.println(this.type);
    }

    @Override
    public String toString() {
        return "desktop";
    }
}
