package methods;

public class MultipleTransferExample {
    public static void main(String[] args) {
goTo("London","china ");

makeEmail("james", "bond",25);
    }
    public static void goTo(String origin, String newLocation){
        System.out.println("You start from "+origin);
        System.out.println("And you're going to "+newLocation);
    }
    public static void makeEmail (String firstName, String lastName , int age ){
        String email =firstName + age +lastName+ "@cybertek.com";
        System.out.println(email);
    }
}
