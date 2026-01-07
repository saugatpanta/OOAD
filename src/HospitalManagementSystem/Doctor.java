package HospitalManagementSystem;

public class Doctor extends  User{
    private String role = "doctor";
    private String speciality;
    private String department;
    private String shift;
    private String qualification;

    public Doctor(String username, String password, int user_id
            , String speciality,
              String department, String shift,
              String qualification)
    {

        super(username, password, user_id);

        this.speciality = speciality;
        this.department = department;
        this.shift = shift;
        this.qualification = qualification;
    }

    public void changeSpeciality (String speciality){
        this.speciality = speciality;
    }

    public void changeShift(String shift){
        this.shift = shift;
    }

    public void changeQualification (String qualification){
        this.qualification = qualification;
    }

    public void printDetails(){
        System.out.println("Username: " + getUsername() +
                "\nRole: " + role +
                "\nSpeciality: " + speciality +
                "\nDepartment: "+ department +
                "\nShift: " + shift +
                "\nQualification: " + qualification);
    }

    public String getShift(){
        return shift;
    }

    public String getSpeciality(){
        return speciality;
    }

    public String getDepartment(){
        return department;
    }

    public String getQualification(){
        return qualification;
    }
}
