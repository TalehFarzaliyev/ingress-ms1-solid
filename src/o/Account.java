package src.o;

public class Account implements BankService {

    private double balance;
    private String firstName;
    private String lastName;
    private String fin;

    public Account(double balance, String firstName, String lastName, String fin) {
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fin = fin;
    }

    public double getBalance() {
        return balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFin() {
        return fin;
    }

    public void updateBalance(double amount) {
        balance += amount;
    }

    @Override
    public boolean login(String fin) {
        if(fin == getFin())
            return true;
        else
            return false;
    }

    @Override
    public void deposit(long amount) {
        balance += amount;
    }

    @Override
    public void withDraw(long amount) {
        balance -= amount;
    }

}
