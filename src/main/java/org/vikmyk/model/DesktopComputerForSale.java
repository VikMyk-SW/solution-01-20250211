package org.vikmyk.model;

import java.math.BigDecimal;

public class DesktopComputerForSale extends ProductForSale {

    public DesktopComputerForSale() {
        super("Desktop Computer", BigDecimal.valueOf(700.0), "This desktop is a modern computer");
    }

    @Override
    public void showDetails() {
        System.out.println(this.description);
        System.out.println("The price of the piece is %d euro.".formatted(this.price));
        System.out.println(this.type);
    }
}
