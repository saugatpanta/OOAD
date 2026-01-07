package PayrollSystem;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        CashPayment cashPayment = new CashPayment();
        cashPayment.pay(15200);

        EsewaPayment esewaPayment = new EsewaPayment("saugatpanta", "51452895684887563");
        esewaPayment.pay(15230);
        esewaPayment.printReceipt();
    }
}
