package org.vikmyk;

import org.vikmyk.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Store {


    public static void main(String[] args) {

        List<ProductForSale> storeListForSale = new ArrayList<>(Set.of(
                new DesktopComputerForSale(),
                new LaptopForSale(),
                new ComputerDeskForSale(),
                new ChairForSale()
        ));

        for (ProductForSale item : storeListForSale) {
            System.out.println("----------------------------------------------");
            item.showDetails();

        }

    }
}