package classes;

public class Flag {
    //flag class is the object
    String coumtry;
    int size;
    String color;
    String material;

    public void info(){
        System.out.println("Country: "+ coumtry);
        System.out.println("size: "+ size);
        System.out.println("Color: "+ color);
        System.out.println("Material: " + material);
    }
    public void flap(){
        System.out.println("Flag is flapping ");
        // create the method called upgrade.
        //method should accept int for size and String for material .
        // method upgrade should reassign the current.
        // size and materials with given new values.
        }
        public void upgrade(int size, String material){
            this.size=size;
          this.material=material;
            System.out.println("This is my size: "+ size);
            System.out.println("This is my material : "+ material);


    }
}
