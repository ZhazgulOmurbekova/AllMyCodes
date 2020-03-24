package abstract2;

public class Chrome extends Browser {
    @Override
    public void launch(){
        System.out.println("Chrome is Launching");
    }


    @Override
    public void browse(String url){
        System.out.println("chrome is browsing URL " + url);
    }
    public int getNumOfTabs(){
        return 1;
    }

    @Override
    public int getNumOfTabs(String a) {
        return 0;
    }
}
