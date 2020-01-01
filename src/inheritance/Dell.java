package inheritance;

import inheritancePart2.Laptop;
import inheritancePart2.Lenovo;

public class Dell extends Laptop {



    public static void main(String[] args) {
        Dell dell = new Dell();
        dell.color = "red";
        System.out.println(dell.color);
       // Laptop lap = new Laptop();
    }
}
