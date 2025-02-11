package org.vikmyk.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ChairForSale extends ProductForSale {

    public ChairForSale() {
        super("Reading Chair", BigDecimal.valueOf(200.0), "This chair was manufactured in Estonia");
    }

    @Override
    public void showDetails() {
        System.out.println(this.description);
        DecimalFormat df = new DecimalFormat("#####.##");
        System.out.println("The price of the piece is %s euro.".formatted(df.format(this.price)));
        System.out.println(this.type);
    }
}
