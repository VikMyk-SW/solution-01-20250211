package org.vikmyk.model;

import java.math.BigDecimal;

public class ComputerDeskForSale extends ProductForSale {
    public ComputerDeskForSale() {
        super("Computer Desk", BigDecimal.valueOf(100.0), "This desk was manufactured in Estonia");
    }

    @Override
    public void showDetails() {
        System.out.println(this.description);
        System.out.println("The price of the piece is %d euro.".formatted(this.price));
        System.out.println(this.type);
    }
}
