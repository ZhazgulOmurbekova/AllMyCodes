package strings;

import java.util.Random;
import java.util.Scanner;

public class HomwStrin2 {
    public static void main(String[] args) {

        /*Send Message: User will enter a message, if message is valid it will be sent, there is a chance
         the message will not be delivered due to internet
> User takes a message that needs to be at least 15 characters
> If the message is valid user will see message: “sent” and “not sent” if the message was not valid
> If message was sent there is a 50 % chance the message will not be delivered.  >> If the message is delivered user
 will see message: “ delivered”
HINT: use random number for random chance to send*/
        Random chance = new Random();


        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your message");
        String message = scanner.nextLine();


        if (message.length()>=15){
            System.out.println("sent");


            int rand = chance.nextInt(1);

        if (rand% 2==0){
            System.out.println("not delivered");

        }
        else {//if (rand==1)
            System.out.println("delivered");
        }

        }
        else  {
            System.out.println("not sent");

//          switch (rand) {
//              case 1:
//                  System.out.println("message is sent");
//                  break;
//              case 2:
//                  System.out.println("is not sent");
//                  break;
          }



        }
    }

