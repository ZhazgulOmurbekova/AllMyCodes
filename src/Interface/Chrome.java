package Interface;

import Abstract2.Browser;

public class Chrome extends Browser implements Bookmark{
    @Override
    public void close() {
        super.close();
    }

    @Override
    public void addUrlToBookmark(String url) {
        System.out.println("url was add to bookmark " + url);

    }

    @Override
    public void removeUrlFromBookmark(String url) {
        System.out.println("url was removed from bookmarks");
    }

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