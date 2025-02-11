package org.vikmyk.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ComputerDeskForSale extends ProductForSale {
    public ComputerDeskForSale() {
        super("Computer Desk", BigDecimal.valueOf(100.0), "This desk was manufactured in Estonia");
    }

    @Override
    public void showDetails() {
        System.out.println(this.description);
        DecimalFormat df = new DecimalFormat("#####.##");
        System.out.println("The price of the piece is %s euro.".formatted(df.format(this.price)));
        System.out.println(this.type);
    }
}
