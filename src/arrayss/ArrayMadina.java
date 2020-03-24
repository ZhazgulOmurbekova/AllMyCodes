package arrayss;

public class ArrayMadina {

    public static void main(String[] args) {
        int [] arr = {1,2,4,2,1};

        boolean check = false;

        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i] != arr[arr.length-1-i]){
               check = false;
            }
            else {
                check = true;
            }


        }
        System.out.println(check);


    }
}
