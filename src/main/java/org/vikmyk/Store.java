package org.vikmyk;

import org.vikmyk.model.ComputerDeskForSale;
import org.vikmyk.model.DesktopComputerForSale;
import org.vikmyk.model.LaptopForSale;
import org.vikmyk.model.ProductForSale;

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
                new ComputerDeskForSale()
        ));;

        for (ProductForSale item : storeListForSale) {

        }

    }
}