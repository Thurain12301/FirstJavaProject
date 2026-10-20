package org.example.oct20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorExample {

    static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Apple");
        cart.add("Orange");
        cart.add("Juice");
        cart.add("Wine");
        cart.add("Bread");
        cart.add("Milk");

        System.out.print("Before Remove Wine :\n" + cart + "\n");
        System.out.println();

        Iterator<String> iterator = cart.iterator();


        while (iterator.hasNext()) {

            String item = iterator.next();

            if (item.contains("Wine")) {
                iterator.remove();
            }
        }
        System.out.print("After Remove Wine :\n" + cart);

    }
}