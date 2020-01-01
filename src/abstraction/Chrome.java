package abstraction;

public class Chrome extends Browser{
    @Override
    public void launch(){
        System.out.println("Chrome is Launching");
    }


    @Override
    public void browse(String url){
        System.out.println("chrome " + url);
    }


}
