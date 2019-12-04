package constructors;

public class Book {
    String title;
    String author;
    int pages;
    public Book(){

    }
    public Book (String title, String author, int pages){
        this.title =title;
        this.pages=pages;
        this.author=author;
    }
public void info(){
    System.out.println("Name "+ this.title);
    System.out.println("Author"+ this.author);
    System.out.println(" pages "+ this.pages);
    System.out.println();
}
}
