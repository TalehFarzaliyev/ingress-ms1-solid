package src.l;

public class Payment {
    private int paymentId;
    private double amount;

    public Payment(int paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public void createPayment()
    {
        System.out.println("=======Create Payment=======");
        System.out.println("Payment ID => "+ paymentId);
        System.out.println("Payment Amount => "+ amount);
    }
}
