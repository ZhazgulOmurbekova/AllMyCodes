package constructors;

public class CheckPhone {
    public static void main(String[] args) {
        Phone phone= new Phone("Iphone","gold");
        phone.info();

        Phone samsung= new Phone("iphone", "white", 16,true);
       samsung.info();


        System.out.println("---------");
        samsung.text(1234567898, "sdfghj");

        System.out.println("-----------");
        samsung.call(1234565435);
    }
}
