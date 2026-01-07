package PayrollSystem;

import java.util.Date;
import java.util.UUID;

public class CashPayment implements PaymentService {
    private float amount = 0F;
    private Date date = new  Date();
    private String status = "pending";

    public void changeStatus(String status){
        this.status = status;
    }

    @Override
    public void pay(float amount) {
        this.amount = amount;
        changeStatus("paid");
    }

    @Override
    public String getServiceName() {
        return "CashPayment";
    }
}
