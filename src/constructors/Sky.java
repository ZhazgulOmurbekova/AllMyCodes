package constructors;

public class Sky {


    String color;
    int visibleStars;
    boolean loo1;

    public Sky(String colorCode, int num,boolean bool){
            this.color=colorCode;
            visibleStars=num;
            this.loo1=bool;
    }

    public Sky(String collor1, int stars){
        color=collor1;
       visibleStars=stars;
    }

   public void infor(){
    String collor1="djhf";
      int stars=234;
       System.out.println(collor1);
       System.out.println(stars);
    }

    public static void main(String[] args) {
        Sky reSky = new Sky("blue", 12,true);
        System.out.println(reSky.color);
        System.out.println(reSky.visibleStars+ " "+ reSky.loo1);



       reSky= new Sky("red",12);
        System.out.println(reSky.color);
        System.out.println(reSky.visibleStars);

    reSky.infor();
    }
}
