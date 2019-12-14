package finalMemory;

public class MemoryExam {
    public static void main(String[] args) {
        String name = "Jason";
        String str = "Jason";

        String str2 = new String ("Jason");
        String str3 = new String ("Jazgul");

        System.out.println(name == str);

        System.out.println(name.hashCode());
        System.out.println(str.hashCode());
        System.out.println();

        System.out.println(str2.hashCode());
        System.out.println(str == str2);

        System.out.println();
        System.out.println(str3.hashCode());
        System.out.println(str2 == str3);
    }
}
