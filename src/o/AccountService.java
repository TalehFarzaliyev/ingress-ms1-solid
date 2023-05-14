package src.o;

public interface AccountService {
    void deposit(BankService bankService,long amount);
    void withDraw(BankService bankService,long amount);
}
