package interview;

public class PrintArmstrongNumber {
    public static void main(String[] args) {
        int i=1;
        int power;
        int arm;
        int number;

        while(i<500)
        {
            number=i;
            arm=0;
            while(number>0)
            {
                power=number%10;
                arm=arm+(power*power*power);
                number=number/10;
            }
            if(arm==i)
                System.out.println(i);
            i++;
        }

    }
}
