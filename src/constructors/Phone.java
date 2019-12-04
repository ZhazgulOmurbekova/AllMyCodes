package constructors;
/*Create a class Phone.
Instance variables: touchscreen, model, memory, color, phoneNumber.
Create a constructor that accepts two parameters(model, color) and set to corresponding instance variables.
Overload the constructor that accepts 4 parameters(model, color, memory, touchscreen). Set values and check memory.
 If given memory is negative value then print “invalid memory” and don’t set memory value. Otherwise set the memory value.
 */

public class Phone {
    boolean touchScreen;
    String model;
    int memory;
    String color;
    int phoneNum;

    public Phone (String model1, String color1){
        this.model=model1;
        this.color=color1;

    }
    public Phone (String model1, String color1, int memory1,  boolean touchScreen1){
        this.model=model1;
        this.color=color1;
        this.touchScreen=touchScreen1;

        if (memory1<0){
            System.err.println("\ninvalid memory");
            this.memory = 0;
        }else {
            this.memory=memory1;
            System.out.println(memory1);
        }
    }

    public void info(){
        System.out.println("model "+model);
        System.out.println("color "+color);
        System.out.println("memory "+ memory);
        System.out.println("touchScreen "+touchScreen);
        System.out.println("phone number "+ phoneNum);

    }
/*Create a method text that accepts long(phone number) and String(text) and returns boolean. Check given number length and text body.
Print: “%textBody sent to %givenPhoneNumber” if length is 10 and text body is not empty then return true; Print:
 “Invalid phone number or text body” and return false if otherwise.

Create a method call that accepts long (phone number). Print “Calling to %phoneNumber” if phone number length is 10.
    Print “Invalid phone number” if otherwise.*/
public boolean text(long phoneNumber, String text){
    String pString = phoneNumber+"";
        if (pString.length()==10 && !text.isEmpty()){
            System.out.println(text+ " is sent to "+phoneNumber);
            return true;
        }else {
            System.out.println("Invalid phone number ot text boby");
            return false;
        }
}
public void call(long phoneNumber){
    String pString =phoneNumber+"";
    if (pString.length()==10){
        System.out.println("call to "+ phoneNumber);

    }else {
        System.out.println("invalid number");
    }
}
}
