package constructors;

public class CheckStudents {
    public static void main(String[] args) {
        Student studentOne= new Student("James");

        Book book1= new Book("java","Cybertek", 20);

        studentOne.read(book1);
    }
}
