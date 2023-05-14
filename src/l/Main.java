package src.l;

public class Main {
    public static void main(String[] args) {
        var azericard = new Azericard(111111,500);
        azericard.createPayment();

        var million = new Million(111111,500);
        million.createPayment();

    }
}
