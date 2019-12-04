package nurdinsExampl;

public class Student {
    String firstName;
    String lastName;
    int age;
   boolean isActive;

   public String info(){

return  String.format(
        "firstName = %s,\nLastName = %s,\nage = %s,\nisActive = %s"
        ,firstName,lastName,age,isActive
);
    }
    public String toString(){

        return  String.format(
                "firstName = %s,\nLastName = %s,\nage = %s,\nisActive = %s"
                ,firstName,lastName,age,isActive
        );
    }

}
