package polymorphismCasting;

public class Person {
    private  String name;
    public  Person(String name){
        this.name = name;
    }
public void info(){
    System.out.println("Get name " + getName());
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasSameName(Person otherPerson){
        return this.getName().equalsIgnoreCase(otherPerson.getName());
    }
}
