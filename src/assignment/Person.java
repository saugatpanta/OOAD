package assignment;
//4.	Create a class Person with a parameterized constructor that initializes name and age.
public class Person {
    private String name;
    private int age;

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
