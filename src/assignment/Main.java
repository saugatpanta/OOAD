package assignment;
//Write a main() method to create objects of Student and Teacher and display their details.
public class Main {
    public static void main(String[] args) {
        Teacher tc = new Teacher("Sushil Dyopala", 30, "Computer Science");
        Student sc = new Student("Saugat Panta", 20, 24080059);

        System.out.println("Teacher Details: ");
        System.out.println(tc.displayTeacherDetails());
        System.out.println("Student Details: ");
        System.out.println(sc.displayStudentDetails());
    }
}
