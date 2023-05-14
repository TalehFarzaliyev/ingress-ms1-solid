package src.o;

public class BalanceService implements AccountService{
    @Override
    public void deposit(BankService bankService,long amount) {
        bankService.deposit(amount);
    }

    @Override
    public void withDraw(BankService bankService,long amount) {
        bankService.withDraw(amount);
    }
}
