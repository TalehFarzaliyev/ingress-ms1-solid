package o;

public class Main {
    public static void main(String[] args) {
        var account = new Account(5000,"Tale","Farzaliyev", "qwerty1");

        var balanceService = new BalanceService();
        balanceService.deposit(account, 500);
        System.out.println("After Deposit balance: " + account.getBalance());
        balanceService.withDraw(account,1000);
        System.out.println("After Withdraw from balance: " + account.getBalance());

    }

}
