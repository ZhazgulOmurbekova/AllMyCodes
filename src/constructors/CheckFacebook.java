package constructors;

public class CheckFacebook {
    public static void main(String[] args) {
         FacebookUser obj1= new FacebookUser("james ", "pass");
        FacebookUser obj2= new FacebookUser("james ", "pass");
        obj1.numOfFriends=500;
        obj2.numOfFriends=500;
        obj2.name="Adam";
        System.out.println(obj1.sendFriendRequest(obj2));
    }
}
