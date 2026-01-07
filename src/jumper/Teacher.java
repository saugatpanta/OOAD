package jumper;

public class Teacher extends  Person{
    private String department;
    public Teacher(String name, String address, String department) {
        super(name, address);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
