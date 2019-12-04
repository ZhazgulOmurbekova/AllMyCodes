package arrayLists;

import java.util.ArrayList;

public class Exa {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("ghjk");
        name.add("Nurgazy");
       name.remove(1);

       name.add(1,"eleme");
       name.set(1, "jazgul");
        System.out.println(name);

    }
}
