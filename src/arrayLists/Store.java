package arrayLists;
/*1. Create a class Store.
Instance variables: name, address, list of Item, number of items.
 Create a constructor that accepts name and address and set both values to corresponding instance variables.

Create a method addItem. This method doesn’t return anything and it accepts Item object as parameter. Simply add given
        Item to the list of items and increment number of items by one.
Create a method seeInventory. This method doesn’t take or return anything. It should simply print each and every single item information.
        Note: You can use info method that Item class has.*/

import constructors.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    String address;
    String name;
    ArrayList<Item> items = new ArrayList<>();
    int numOfItem;
    double totalSales;
   // double price;

    public Store(String address, String name){
        this.address=address;
        this.name= name;

    }
    public void addItem (Item item){
       this.items.add(item);
       this.numOfItem++;
    }public void addItem(){
        /*Store Task Part II
Overload the method addItem.
Method doesn't take anything.
This method should ask user how many items to enter.
Method should ask Item name and price and add the
Item to the items list based on the quantity user entered. */
        Scanner input = new Scanner(System.in );
        System.out.println("How many items ");
        int num = input.nextInt();
        input.nextLine();

        for (int i=0; i< num; i++){
            System.out.println("Enter name "+(i+1));
            String name= input.nextLine();
            System.out.println("Enter price "+(i+1));
            double price = input.nextDouble();
            input.nextLine();
            Item item = new Item(name, price );

            items.add(item);
            numOfItem++;
        }
    }
    public void sellItem(String  name){
        /*Modify Store class.
Add instance variable totalSales.
Create method sellItem. Method accepts name of the Item and doesn’t return anything.
Check if name of the item is in the list. If it’s in stock remove from the list and add the price to totalSales
 and give success transaction message. If doesn’t exist in the list give failed transaction message and terminate the method.
         */
        for (int i = 0; i<items.size(); i++ ){
             if (items.get(i).name.equals(name)){
                   this.totalSales+=items.get(i).price;
                   items.remove(i);
                   System.out.println("Successful transaction! thank you for the money ");
                   numOfItem--;
                   return;
          }
        }
        System.out.println("Item is not in stock");
    }
    public void  returnItem(String name){
        /*Create method returnItem. Method takes item name and doesn’t return anything. Ask user to enter the price of an item.
        Then create Item object from given information and add to the items list. Also maintain totalSales.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price of the return item ");
        double price = input.nextDouble();
        Item item = new Item(name, price);
        items.add(item);
        totalSales-=price;
         numOfItem++;
        System.out.println("\nReturn process successful.  ");



    }

    public void seeInventory(){
        System.out.println("\n Zara Chicago Store ");
        System.out.println("Total sales "+ this.totalSales+ " $");

        for (Item item : items){
            System.out.println();
         item.info();
        }}

//       public void addItem( ){
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Pleas enter how many items ");
//       int quantity = input.nextInt();
//        input.nextLine();
//        for (int i=0; i < quantity; i++) {
//
//            System.out.println("Pleas enter  name for item# "+(i+1));
//           String name=input.nextLine();
//            System.out.println("price"+(i+1));
//            double price= input.nextDouble();
//            input.nextLine();
//            Item item = new Item(name,price);
//            this.items.add(item);
//            this.numOfItem++;
//
//        }
//    }

}
