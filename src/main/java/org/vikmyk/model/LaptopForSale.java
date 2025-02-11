package org.vikmyk.model;

import java.math.BigDecimal;

public class LaptopForSale extends ProductForSale {

    public LaptopForSale() {
        super("Laptop", BigDecimal.valueOf(900.0), "This laptop is a modern computer");
    }

    @Override
    public void showDetails() {
        System.out.println(this.description);
        System.out.println("The price of the piece is %d euro.".formatted(this.price));
        System.out.println(this.type);
    }
}
