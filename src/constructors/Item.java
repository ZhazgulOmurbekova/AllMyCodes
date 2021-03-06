package constructors;

public class Item {
    /*Create a class Item that has instance variables name and price.
Create a constructor that sets both the name and the price.
Create a method that will print the name of the item and the price
Create a program that will ask user to enter how many items they have.
Ask from the user to enter all the names and prices of each item. Make an Item array that will hold all the items.

After you have the array loop through it and print the information of all the items*/

   public  String name;
    public double price;
    int size;

    public Item (String name , double price){
        this.name=name;
        this.price=price;
    }//Overload the constructor that takes 3 parameters to set all 3 instance variables
    public Item (String name, double price, int size){

        this(name,price);
//        this.name= name;
//        this.price=price;
        this.size=size;
    }// we can call constructor inside another constructor.
    //it is called constructor chaining .
    // we can do it using keyword 'this ' with the parenthesis

    public void info(){
        System.out.println("\name: "+name);
        System.out.println("price: "+ price);
    }
}
