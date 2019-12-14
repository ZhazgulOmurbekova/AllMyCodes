package encapsulation;

public class AppStore {

    public static void main(String[] args) {
        App whatsapp = new App("WhatsApp", "Social Network", 2.3);

        whatsapp.info();
        whatsapp.update();
        whatsapp.setSize(2.6);
        whatsapp.info();
        System.out.println(App.getNumOfApps());
        System.out.println();

        whatsapp.setReview("Coolest app!");
        System.out.println(whatsapp.getReview());
        whatsapp.setReview("Cool!");
        System.out.println(whatsapp.getReview());
        whatsapp.setReview("Cool cool!");
        System.out.println(whatsapp.getReview());

    }
}
