package customException;

import java.util.Random;

public class Laptop {
    private String os;


    public void setOs(String os) throws InvalidOSException{
        switch (os) {
            case "Windows":
            case "Mac":
            case "Linux":
                this.os = os;
                break;
            default:
                throw new InvalidOSException();

        }
    }

    public boolean turnOn() {
        Random r = new Random();
        int num = r.nextInt(11);
        System.out.println(num);
        if (num >= 8) {
            //computer does not turn on
            throw new LAptopNotTurnException();


        }
        return true;
    }
}
