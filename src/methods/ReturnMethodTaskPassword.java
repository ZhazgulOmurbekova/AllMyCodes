package methods;

public class ReturnMethodTaskPassword {
    public static void main(String[] args) {
        /*Create a method for logging in. User passes the username and password as parameters.
        If the passed values are the same as the given username and password return true, but
        if either the username or password is invalid return false

Username: james123
Password: password*/
       if (loginMethod("james123","password")){
           System.out.println("logined ");
       }
       else {
           System.out.println("invalid");
       }

    }
    public static  boolean loginMethod(String username , String password){
        String validUsername="james123";
        String validPass="password";
        if (validUsername.equals(username)&& validPass.equals(password)){
            return true;

        }
        return false;

    }
}
