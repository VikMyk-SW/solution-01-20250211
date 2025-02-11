package org.vikmyk.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DesktopComputerForSale extends ProductForSale {

    public DesktopComputerForSale() {
        super("Desktop Computer", BigDecimal.valueOf(700.0), "This desktop is a modern computer");
    }

    @Override
    public void showDetails() {
        System.out.println(this.description);
        DecimalFormat df = new DecimalFormat("#####.##");
        System.out.println("The price of the piece is %s euro.".formatted(df.format(this.price)));
        System.out.println(this.type);
    }
}
