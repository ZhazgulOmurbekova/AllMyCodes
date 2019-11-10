package scanners;

import java.util.Scanner;

public class CalculSwitchS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num 1 ");
        double num1 = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Enter num 2 ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operator");
        String operator = scanner.nextLine();

        double result = 0;
        boolean valid = true;
        switch (operator) {
            case "+":
                result=num1 + num2;
                break;
            case "-":
                result=num1 - num2;
                break;
            case "*":
                result=num1 * num2;
                break;
            case "/":
               result= num1 / num2;
                break;

            default:
                System.out.println("invalid num");
        valid = false;
        }
         if (valid){
             System.out.println(num1+ operator + num2 + "= " + result);
 }
    }
}

