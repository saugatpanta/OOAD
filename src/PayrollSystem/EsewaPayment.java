package PayrollSystem;

import java.util.Date;
import java.util.UUID;

public class EsewaPayment implements PaymentService {
    private float amount = 0F;
    private Date date;
    private int transactionId;
    private String accountNum;
    private String status = "pending";
    private String username;

    public EsewaPayment(String username, String accountNum) {
        this.username = username;
        this.accountNum = accountNum;
    }

    public void changeStatus(String status) {
        this.status = status;
    }

    public void printReceipt() {
        System.out.println("Payroll System Receipt:");
        System.out.println("Username: " + username
                + "\nTransaction Id: " + transactionId +
                "\nAccount Number: " + accountNum+
                "\nDate: " + date +
                "\nStatus: " + status +
                "\nAmount: " + amount +
                "\nPayment Type: " + getServiceName()
        );
    }

    @Override
    public void pay(float amount) {
        this.amount = amount;
        transactionId = UUID.randomUUID().hashCode();
        changeStatus("Completed");
        date = new Date();
    }

    @Override
    public String getServiceName() {
        return "EsewaPayment";
    }
}
