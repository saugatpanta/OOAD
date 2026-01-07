package HospitalManagementSystem;

public class Patient extends User{
    private String role = "Patient";
    private int age;
    private String address;
    private long contact;
    private Doctor doctor = null;
    public Patient(String username, String password,
                   int user_id,
                   int age, String address,
                   long contact)
    {
        super(username, password, user_id);
        this.age = age;
        this.address = address;
        this.contact = contact;
    }

    public void changeAge(int age){
        this.age = age;
    }

    public void changeContact(long contact){
        this.contact = contact;
    }

    public int getAge(){
        return this.age;
    }

    public void assignDoctor(Doctor doctor){
        this.doctor = doctor;
    }

    public void printDetails(){
        System.out.println("Username: " + getUsername() +
                "\nRole: " + role +
                "\nage: " + age +
                "\naddress: " + address +
                "\ncontact: " + contact + "\n");
        System.out.println("Doctor Details: ");
        this.doctor.printDetails();
    }
}
