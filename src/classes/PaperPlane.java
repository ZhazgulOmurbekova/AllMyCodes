package classes;

public class PaperPlane {
    public static void main(String[] args) {
        //Create 2 Flag object
        // Set all values to first one only
        // and copy first object instance variable values to second one
        // and reset the first object values to zero numbers and a to String
        Flag flag1= new Flag();
        flag1.coumtry="Argentina ";
        flag1.size=123;
        flag1.color="Sky blue ";
        flag1.material="Plastic";


        Flag flag2= new Flag();

        flag2.coumtry= flag1.coumtry;
        flag2.size= flag1.size;
        flag2.color= flag1.color;
        flag2.material= flag1.material;


        flag1.coumtry="A ";
        flag1.size=1;
        flag1.color="S";
        flag1.material="P";

        flag1.info();
        System.out.println();

        flag2.info();
        System.out.println();

        flag1.upgrade(14,"djfh");



    }

}
