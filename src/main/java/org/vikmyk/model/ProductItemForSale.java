package org.vikmyk.model;

import java.math.BigDecimal;

/**
 * Abstract class that is represented item for sale
 * that extends {@link ProductItem} class.
 * <p>
 * This class is a sealed class that can be extended by
 * four classes: {@link ChairItemForSale}, {@link ComputerDeskItemForSale},
 * {@link DesktopComputerItemForSale}, {@link LaptopItemForSale}.
 *
 * @version 1.0
 */
public abstract sealed class ProductItemForSale extends ProductItem
        permits ChairItemForSale, ComputerDeskItemForSale, DesktopComputerItemForSale, LaptopItemForSale {

    String type;

    String description;

    BigDecimal salesPrice;

    protected ProductItemForSale(String type, BigDecimal salesPrice, String description) {
        this.description = description;
        this.salesPrice = salesPrice;
        this.type = type;
    }

    public BigDecimal getSalesPrice() {
        return this.salesPrice;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void printPricedItem() {
        System.out.println("The price of the piece is %,.1f euro.".formatted(this.salesPrice));
    }

    public abstract void showDetails() ;
}
