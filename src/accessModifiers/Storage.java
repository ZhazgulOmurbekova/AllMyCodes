package accessModifiers;

import java.util.Scanner;

public class Storage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Person p = new Person();
        p.setName("Jazgul");
        System.out.println(p.getName());

        p.setAge(59);
        System.out.println(p.getAge());

        p.setGender("male");
        System.out.println(p.getGender());

        p.setHeight(123);
        System.out.println("\n"+p.getHeight());
        p.setWeight(23);
        System.out.println(p.getHeight());

        do {
            System.out.println("enter age");
          int age = s.nextInt();
          if (age > 0 && age < 120){
              p.setAge(age);
              break;
          }

        }while (true);
    }
}
