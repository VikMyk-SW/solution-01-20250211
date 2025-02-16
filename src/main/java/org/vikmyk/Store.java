package org.vikmyk;

import org.vikmyk.model.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Store {

    static List<ProductItemForSale> storeListForSale;

    static List<Order> orders;

    public static void main(String[] args) {

        storeListForSale = new ArrayList<>(List.of(
                new DesktopComputerItemForSale(),
                new LaptopItemForSale(),
                new ComputerDeskItemForSale(),
                new ChairItemForSale()
        ));

        for (ProductItemForSale item : storeListForSale) {
            System.out.println("----------------------------------------------");
            item.showDetails();
        }

        System.out.println();

        List<OrderItem> orders1 = List.of(
                new OrderItem(2, new LaptopItemForSale()),
                new OrderItem(1, new DesktopComputerItemForSale())
        );

        List<OrderItem> orders2 = List.of(
                new OrderItem(5, new ChairItemForSale()),
                new OrderItem(1, new DesktopComputerItemForSale()),
                new OrderItem(1, new ComputerDeskItemForSale())
        );

        orders = List.of(
                new Order(1L, orders1),
                new Order(2L, orders2)
        );

        orders.forEach(order -> {
            order.printOrder();
            System.out.println();
        });

    }
}