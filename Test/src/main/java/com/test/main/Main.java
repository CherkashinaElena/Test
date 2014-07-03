package com.test.main;

import com.test.container.Container;
import com.test.good.Good;
import com.test.good.Laptop;
import com.test.good.TV;

/**
 * Created by Elena on 02.07.2014.
 */
public class Main {

    public static void main(String[] args) {
        Container container = new Container();

        Good laptop = new Laptop();
        laptop.setName("Asus");
        laptop.setPrice(4000.211);
        ((Laptop)laptop).setProcessor("Intel core");
        ((Laptop)laptop).setVideoCard("635M");

        Good tv = new TV();
        tv.setName("Samsung");
        tv.setPrice(8984.276);

        Good laptop1 = new Laptop();
        laptop1.setName("Acer");
        laptop1.setPrice(7384.345);

        container.addGood(laptop);
        container.addGood(tv);
        container.addGood(laptop1);

        container.printList();

        System.out.println("\n");

        container.sortList();

        System.out.println("Sorted list:\n");
        container.printList();
    }
}
