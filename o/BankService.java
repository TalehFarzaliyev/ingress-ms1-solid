package o;

public interface BankService {

    boolean login(String fin);
    void deposit(long amount);
    void withDraw(long amount);
}
