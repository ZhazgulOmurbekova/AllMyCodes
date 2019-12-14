package constructors;

import java.util.Scanner;

public class ItemCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many items they have");
        int  numOfitems= input.nextInt();
        input.nextLine();


        Item [] myItem= new Item[numOfitems];

        for (int i=0; i< myItem.length;i++ ){

        System.out.println("Enter  the  name of Items"+(i+1));
        String nameOfItem= input.nextLine();
        System.out.println("Enter all the price of Item's price"+(i+1));
        double priceOfItem=input.nextDouble();
        input.nextLine();

            myItem[i]= new Item(nameOfItem,priceOfItem);

        }
        for (Item item: myItem){
            item.info();
        }
    }
}
