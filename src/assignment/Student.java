package assignment;
//Create a subclass Student with:
//•	Additional variable roll number
//•	A parameterized constructor that calls the superclass constructor using super
//•	Has a method displayStudentDetails() that prints all details
public class Student extends Person {
    private int rollNumber;
    public Student(String name, int age , int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public String displayStudentDetails(){
        return "Student Name: "+getName() + ", Age: "+getAge() + ", Roll Number: "+ rollNumber;
    }
}
