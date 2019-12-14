package methods;

public class ReturnCalculatorTreeArguments {

    /*Create a calculator method that will take three arguments: an operator ( +, -, *, \, %)
    and two numbers. Perform that operation between the two numbers and return the result
     */
    public static void main(String[] args) {
        System.out.println(calculatArguments("*",3,4));
    }

    public static double calculatArguments(String op, double one , double two) {

       switch (op){
           case  "+":
               return one+two;
           case  "-":
               return one-two;
           case  "*":
               return one*two;
           case  "/":
               return one/two;
           case  "%":
               return one%two;
           default :
               System.out.println("Invalid op");
             return 0;
       }

    }
}
