package assignment;
//Create another subclass Teacher with:
//•	Additional variable department
//•	A parameterized constructor that calls the superclass constructor
//•	Has a method displayTeacherDetails() that prints all details
public class Teacher extends Person {
    String department;
    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String displayTeacherDetails(){
        return "Teacher Name: " + getName() + ", Age: " + getAge() + ", Department: " + department;
    }
}
