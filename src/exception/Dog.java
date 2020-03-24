package exception;

public class Dog {
    int age ;

    public void setAge(int age ) throws Exception{
        if(age < 0 || age >30){
            throw new Exception(age +"is age invalid  ");
        }
        this.age = age;
    }
    public static void bark() throws Exception{
        System.out.println("Dog is barking ");
        throw new Exception();
    }

}
