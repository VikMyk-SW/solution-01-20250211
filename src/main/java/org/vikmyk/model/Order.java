package org.vikmyk.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an order.
 */
public class Order {

    private long id;

    private List<OrderItem> orderItems;

    public Order(long id, List<OrderItem> orderItems) {
        this.id = id;
        this.orderItems = orderItems;
    }

    public void addOrderItem(OrderItem orderItem) {
        if (orderItem == null) {
            orderItems = new ArrayList<>();
        }
        orderItems.add(orderItem);
    }

    public long getId() {
        return id;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems.stream().toList();
    }

    /**
     * Calculate the total price for the order.
     * @return the total price for the order.
     */
    public BigDecimal calculateTotalPrice() {
        return orderItems.stream()
                .map(OrderItem::calculateTotalPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Print the order.
     */
    public void printOrder() {
        System.out.println("Order " + id);
        for (OrderItem orderItem : orderItems) {
            System.out.println("%d items at  %,.1f each (type: %s, description: %s)".formatted(
                    orderItem.getQuantity(),
                    orderItem.getProductForSale().getSalesPrice(),
                    orderItem.getProductForSale().toString(), orderItem.getProductForSale().getType()));
        }
        System.out.println("Total price: %,.1f euro.".formatted(calculateTotalPrice()));
    }
}
