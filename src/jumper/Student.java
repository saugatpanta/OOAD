package jumper;

public class Student extends Person{
    private String course;
    public Student(String name, String address, String course) {
        super(name, address);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}
