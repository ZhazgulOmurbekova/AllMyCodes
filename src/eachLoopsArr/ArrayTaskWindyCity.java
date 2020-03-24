package eachLoopsArr;

public class ArrayTaskWindyCity {
    public static void main(String[] args) {
        /*Write a program and create String array called cities. Initialize the cities with cities below:
Chicago, New York, Madison, Miami, Washington
Iterate through each city and check if Chicago is inside the cities.
Print "Windy city found" if Chicago exists in the array. "Windy city not found" otherwise.
*/
        String[] cities = {"Chicago", "New York","Chicago", "Madison", "Miami", "Washington"};
        boolean check =false;
        int count=0;

            for (String city : cities) {
                if (city.equalsIgnoreCase("Chicago")) {
                    check=true;
                    count++;

                }
            }if (check){
            System.out.println("Windy city found "+ count+" times");

        }
            else {
                    System.out.println("Windy city not found");
                }
            }
            // System.out.println(Arrays.toString(cities));
        }


