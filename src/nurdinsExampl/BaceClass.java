package nurdinsExampl;

import java.sql.Struct;
import java.util.ArrayList;

public class BaceClass {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.firstName="Jazgul";
        student1.lastName = "Omurbekova";
        student1.age = 123;
        student1.isActive = true;

        Student student2 = new Student();

        student2.firstName="John";
        student2.lastName = "Omur";
        student2.age = 12;
        student2.isActive = false;


        Student student3 = new Student();

        student3.firstName="sdcv";
        student3.lastName = "hdfjgk";
        student3.age = 23;
        student3.isActive = true;

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student2);
       // System.out.println();

        for (Student student: students){
            if (student.isActive){

                System.out.println(student.info());
           }
        }

//       if (student1.isActive){
//           System.out.println(student1.firstName);
//       }
//       if (student2.isActive){
//           System.out.println(student2.firstName);
//       }
//       if (student3.isActive){
//           System.out.println(student3.firstName + " " + student3.lastName + student3.age);
//       }


    }
}
