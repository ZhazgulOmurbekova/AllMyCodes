package abstraction;

public class InternetUsing {

    public static void main(String[] args) {
        Chrome ch = new Chrome();

        ch.version = 65.34;
        ch.launch();
        ch.browse("www.stackoverflow.com");

        System.out.println();

        Firefox f= new Firefox();
        f.launch();
        f.browse("www.cybertek.com");


        Safari s = new Safari();

    }
}
