package org.vikmyk.model;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class LaptopForSale extends ProductForSale {

    public LaptopForSale() {
        super("Laptop", BigDecimal.valueOf(900.0), "This laptop is a modern computer");
    }

    @Override
    public void showDetails() {
        System.out.println(this.description);
        DecimalFormat df = new DecimalFormat("#####.##");
        System.out.println("The price of the piece is %s euro.".formatted(df.format(this.price)));
        System.out.println(this.type);
    }
}
