package classes;
/*Part II
Create a program that asks from user details of the house through console and
create object from House. And print the details of created House.
 */

import java.util.Scanner;

public class CheckHouse {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        House house= new House();

        System.out.println("enter type");
        house.type=scanner.nextLine();

        System.out.println("Enter address");
        house.address=scanner.nextLine();

        System.out.println("Enter num of room");
        house.numRoom=scanner.nextInt();

        house.info();
    }
}
