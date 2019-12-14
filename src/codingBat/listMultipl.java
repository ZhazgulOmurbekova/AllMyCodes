package codingBat;

import java.util.List;

public class listMultipl {
    public static void main(String[] args) {

    }public List<String> copies3(List<String> strings) {
     strings.replaceAll(n->n + strings);


        return strings;
    }
    public List<String> addStar(List<String> strings) {
        for (int i = 0; i < strings.size(); i++){
            strings.set(i, strings.get(i)+"*");
        }
        return strings;
    }

    public List<String> moreY(List<String> strings) {
        for (int i = 0 ; i < strings.size(); i++){
            strings.set(i, "y"+strings.get(i)+"y");
        }

        return strings;
    }
    public List<String> lower(List<String> strings) {
        for(int i = 0; i < strings.size(); i++){
    strings.set(i, strings.get(i).toLowerCase());
      }return strings;
    }
    public List<String> noX(List<String> strings) {
       for(int i =0; i < strings.size(); i++){
           if (strings.get(i).contains("x")){
               strings.remove(strings.get(i));

           }
       }
       return  strings;
    }
    public List<Integer> noNeg(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i)<0){
                nums.remove(nums.get(i));

            }
        }return nums;
    }
    public List<Integer> no9(List<Integer> nums) {

        for (int i =0; i < nums.size(); i++){
            nums.get(i % 10);
            if ( nums.get(i) ==9){

               // return nums;
            }
        }
        return nums;
    }
    public List<String> noLong(List<String> strings) {
        for (int i = 0; i < strings.size(); i++){
            if (strings.get(i).length()==4){
                strings.remove(strings.get(i));

            }
        }return strings;
    }
    public List<Integer> two2(List<Integer> nums) {
        for (int i =0; i < nums.size(); i++){
            if (nums.get(i) == 2){
                nums.set(i, nums.get(i)*2);
            }else if (!nums.contains(2) ){
                nums.set(nums.get(i), nums.get(i*2));
            }
        }return nums;
    }
    public List<String> noYY(List<String> strings) {
        for (int i = 0; i < strings.size(); i++){

            if (strings.get(i).endsWith("y")){
                strings.remove(strings.get(i));
                // i--;

            }
            if (strings.get(i).equals("y")){
                strings.remove(strings.get(i));
                //i--;

            } if (strings.get(i).contains("yy")){
                strings.remove(strings.get(i));
                //i--;
            }
            // }  if (!strings.get(i).contains("y"));
            // strings.set(i, strings.get(i)+"y");
        }

        for( int j = 0 ; j<strings.size();j++){
            strings.set(j,strings.get(j)+"y");

        }

        return strings;
    }
    public List<Integer> two(List<Integer> nums) {
        for (int i =0; i < nums.size(); i++){
            if ((nums.get(i)*2)%10==2){
                nums.remove(i);
                i--;
            }else {
                nums.set(i, nums.get(i) * 2);

            }
        }return nums;
    }
    public List<Integer> square56(List<Integer> nums) {
        for (int i =0; i < nums.size(); i++){
            if((nums.get(i)* nums.get(i))%10 != 5 ||(nums.get(i)* nums.get(i))%10 != 6){
                nums.set(i,nums.get(i)* nums.get(i));
            }

        }

        return nums ;
    }




}
