package org.vikmyk.model;

import java.math.BigDecimal;

/**
 * Order item for the order.
 */
public class OrderItem {

    private final Integer quantity;

    private final ProductItemForSale productItemForSale;

    public OrderItem(Integer quantity, ProductItemForSale productItemForSale) {
        this.quantity = quantity;
        this.productItemForSale = productItemForSale;
    }

    // Only getter
    public Integer getQuantity() {
        return quantity;
    }

    public ProductItemForSale getProductForSale() {
        return productItemForSale;
    }

    /**
     * Calculate the total price for the product item.
     * @return the total price for the product item.
     */
    public BigDecimal calculateTotalPrice() {
        return productItemForSale.getSalesPrice().multiply(BigDecimal.valueOf(quantity));
    }

}
