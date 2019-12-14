package replitTask;

public class Person {
    public static void main(String[] args) {

                Person person = new Person();

                person.setFirstName("John");
                person.setLastName("Doe");
                person.setAge(44);
                System.out.println(person.toString());


                System.out.println(person.getFirstName("sdf"));
                System.out.println(person.getLastName("fghjk"));
                System.out.println(person.getAge(23));
                System.out.println(person.toString());

            }



        String firstName;
        String lastName;
        int age;

        public Person(){
            this.firstName = "undefined";
            this.lastName = "undefined";
            this.age = 1;

        }
        public Person(String firstName, String lastName, int age){
            this.firstName= firstName;
            this.lastName=lastName;
            this.age=age;

        }public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }
        public void setAge(int age ){
            this.age = age;
        }
        public String getFirstName(String firstName){
            return firstName;
        }
        public String getLastName(String lastName){
            return lastName;
        }
        public int getAge(int age){
            return age;
        }
    public String toString(String firstName, String lastName, int age){
        return firstName + " | " + lastName + " | " + age;
    }
    }

