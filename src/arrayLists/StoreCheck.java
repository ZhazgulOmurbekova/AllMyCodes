package arrayLists;

import constructors.Item;

import java.awt.*;

public class StoreCheck {
    public static void main(String[] args) {
        Store zara = new Store("312 main st", "zara");
        Item item1 = new Item("socks", 15);
        Item item2 = new Item("coat", 123);
        Item item3 = new Item("t-short", 33);



        zara.addItem(item1);
        zara.addItem(item2);
        zara.addItem(item3);


        System.out.println(zara.numOfItem);
        zara.seeInventory();


        System.out.println();


       //zara= new Store("1111 w somewhere", "Unique");
           zara.addItem();
           zara.seeInventory();
           zara.sellItem("coat");
           zara.seeInventory();
        System.out.println(zara.totalSales);

        //-----------------
        zara.returnItem("fancy glass");
        zara.seeInventory();
        System.out.println("num of items: " + zara.numOfItem);



    }
}
