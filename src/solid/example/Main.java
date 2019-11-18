package solid.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //array to hold orders of customers with name, bill amount ans discount type (strategy)
        List<Customer> orders = new ArrayList<>();

        //Discount types S for Sale, D for Discount, L for Liquidation
        orders.add(new Customer("William Walters", 75.34, 'D'));
        orders.add(new Customer("Susan Smothers", 24.12, 's'));
        orders.add(new Customer("Jessica Johnson", 273.93, 'L'));
        orders.add(new Customer("Richard Ricardo", 171.42, 'D'));

        System.out.println("The size of the array is " + orders.size());

        double total = 0;

        for (Customer o : orders) {
            System.out.println(o.getCustomerName() + " " + o.getBillAmount());
            total += o.getBillAmount();
        }

        System.out.println("Total:    " + total);

    }
}
