package customException;

public class InvalidLocationException extends Exception{
    String location ;

    public InvalidLocationException(){

    }

    public InvalidLocationException(String message){
        super(message);
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }
}
