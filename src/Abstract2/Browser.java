package Abstract2;

public abstract class Browser {


    public abstract void launch();
    public abstract void browse(String url);
    public abstract int getNumOfTabs();
    public abstract int getNumOfTabs(String a);
    public void close(){
        System.out.println("Browser is closing");
    }



}
