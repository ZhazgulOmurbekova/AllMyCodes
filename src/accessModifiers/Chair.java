package accessModifiers;

public class Chair {
   public  int size;
    public String model;

    public void setSize(int size){
        if (size > 0) {


            this.size = size;
        }

    }

    public int getSize(){
        if (model.equals("IKEA")){
            return size;
        }else {
            System.out.println("Not ikea");
            return -1;
        }

    }
    public void info(){
        System.out.println("Size " + size);
        System.out.println("Model "+ model);

    }

}
