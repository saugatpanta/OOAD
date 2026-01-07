package HospitalManagementSystem;

public class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor("saugatpanta", "saugatpanta@123",
                95712,
                "Heart", "Cardiology",
                "Day","PHD in cardiology"
        );

        Patient p = new Patient("sanjibrana",
                "Sanjib@132",651452,
                21, "Mid-Baneshwor" ,
                986694478
        );

        p.assignDoctor(d);
        System.out.print("\n\n----------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nPatient Details with Doctor Assigned: ");
        p.printDetails();
    }
}
