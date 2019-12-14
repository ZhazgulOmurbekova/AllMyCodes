package constructors;/*Create a program that will ask the user how many books they have.
Then they will be asked to enter the book’s title, author, and number of pages.
 Create each book object and store them into a Book array.
Part 2: Loop through your array and print the name of all the books */

import java.util.Scanner;

public class StoreBook2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How may books they have");
        int numOfBook =input.nextInt();
        input.nextLine();

        Book []library= new Book[numOfBook];

        for (int i =0; i<library.length; i++){

        System.out.println("Enter the book's title "+(i+1));
        String title=input.nextLine();

        System.out.println("Enter the book's author "+(i+1));
        String author=input.nextLine();

        System.out.println("Enter the book's pages "+(i+1));
        int pages=input.nextInt();
        input.nextLine();
        Book eachBook =new Book (title,author,pages);
        library [i]=eachBook;
        }for (Book book: library){
            System.out.println(book.title);
        }
    }

}
