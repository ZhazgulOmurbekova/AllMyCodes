package interview;

public class Dublicats2 {
    public static void main(String[] args) {
        int []arr = {500, 20, 400, 200, 300, 20, 500, 10, 10};

        String num = "";
        for (int i = 0; i < arr.length; i ++){
            int counter= 0;
            for(int j = 0; j < arr.length; j++){
            if (arr[i] == arr[j]){
                counter++;

                if (!num.contains(arr[i] + "") && counter >1){
                    num+=arr[i] + " ";
                }
              }
            }
        }
        System.out.println(num);
    }
}
