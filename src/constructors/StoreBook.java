package constructors;

public class StoreBook {
    /*Create a program that will ask the user how many books they have.
    Then they will be asked to enter the book’s title,
    author, and number of pages. Create each book object and store them into a Book array.

Part 2: Loop through your array and print the name of all the books */
    public static void main(String[] args) {
        Book book1=new Book("Java","cybertek", 200);
        Book book2=new Book("automation ","cybertek", 100);
        Book book3=new Book("auto ","cybertek", 300);

        Book []myBook =new Book[3];
        myBook[0]=book1;
        myBook[1]=book2;
        myBook[2]=book3;

        myBook[0].pages=50;


      //  Book [] myBook2=new Book[4];

        for (Book eachBook: myBook){
            eachBook.info();
            //System.out.println(eachBook.name+ " has "+ eachBook.pages+" pages ");
        }
        for (int i =0, j=50; i<myBook.length;i++, j+=100){
            myBook[i].title ="sdf";
            myBook[i].pages=j;

        }
        for (Book eachBook: myBook){
            eachBook.info();
            //System.out.println(eachBook.name+ " has "+ eachBook.pages+" pages ");
        }
    }
}
