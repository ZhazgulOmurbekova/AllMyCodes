package polymorphismCasting;

public class TestClass {
    public static void main(String[] args) {
       Student stu = new HighSchoolStudent("james", 19, 5);
        stu.info();
       Person stu2 = new HighSchoolStudent("james", 19, 5);
        System.out.println(stu.equals(stu2));
    }
}
