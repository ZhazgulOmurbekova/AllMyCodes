package encapsulation;

import java.util.ArrayList;

public class App {

    /*Create a class App
This class represents Application on the mobile phone.
An instance of App should have information about its name, category, rating, description, size, list of reviews.
Create a constructor for App so that user can create App object only passing name, category, and size.
Encapsulate all instance variable.
Create a method open. Method is used to open the App on the phone. It should print “%appName is opening”.
Create a method close. Same as open method for closing.
Create a method update. Method should print “%appName is updating”.
Add static variable numberOfApps. This class member should be increased each time App object gets created.
Create a method info. Method should print all information about App except for reviews.
Modify method setReview. Method should accept String message. Method adds review to the list of reviews if message
 is at least 3 letters and prints success message. If message less than 3 letters then it should NOT add the review
 and should print failure message.
     */
    private String name;
    private String category;
    private double rating;
    private String description;
    private double size;

    private static int numOfApps;

    private ArrayList<String> review ;

    public App(String name, String category, double size) {
        this.name = name;
        this.category = category;
        this.size = size;
        numOfApps++;
        this.review = new ArrayList<>();
    }
public App(){

}

    public static int getNumOfApps() {
        return numOfApps;
    }

    public void open() {
        System.out.println(this.name + "is opening");
    }

    private void close() {
        System.out.println(this.name + "is closing");
    }

    public void update() {
        System.out.println(this.name + "is updating");

    }

    public void info() {
        System.out.println("Name " + name);
        System.out.println("Category " + category);
        System.out.println("Rating " + rating);
        System.out.println("Description " + description);
        System.out.println("Size " + size);
    }

    public void setReview(String message) {
        if (message.length() >= 3) {
            this.review.add(message);
            System.out.println("Success message");
        } else {
            System.out.println("Failure message");
        }
    }

    public ArrayList<String> getReview() {
        return review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public static void setNumOfApps(int numOfApps) {
        App.numOfApps = numOfApps;
    }
}

