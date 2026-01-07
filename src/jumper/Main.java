package jumper;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Saugat Panta", "Kapan", "BCSIT");
        Teacher t = new Teacher("Sushil Dyopala", "Baneshwor", "CS");

        System.out.println("Name: " + s.getName() + ", Address: " + s.getAddress() + ", Course: " + s.getCourse());
        System.out.println("Name: " + t.getName() + ", Address: " + t.getAddress() + ", Department: " + t.getDepartment());

    }
}
