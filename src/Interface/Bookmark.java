package Interface;

/*Create an interface Bookmark with abstract methods:
    addUrlToBookmark() and removeUrlFromBookmark()
    > Both methods will take a String url
Implement the methods in the Chrome class
    - When add method is called, user sees:
        givenurl added to bookmarks
    - Wehn remove method is called, user sees:
        givenurl removed from bookmarks*/

public interface Bookmark {

     void  addUrlToBookmark(String url);
     void  removeUrlFromBookmark(String url);


}
