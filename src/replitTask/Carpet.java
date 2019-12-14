package replitTask;

public class Carpet {
    //do not change -- Start
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below
    public Carpet(){
        this.width = 300 * 300;
        this.totalPrice = 200;
        this.unitPrice = 0;

    }public Carpet(int width, int length, int unitPrice, boolean isPersian){
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public void setString(){
        totalPrice = width + length * unitPrice;
        if (isPersian){
            System.out.println(totalPrice + 200);
        }



    }



}
