public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(993, "Sparkple");
        account.deposit(1000);
        account.deposit(250);
        account.withdraw(300);
        System.out.println("Текущий баланс: $" + account.getBalance());
        System.out.println("accountHolder: "+account.getAccountHolder());
        System.out.println("AccountNumber: "+account.getAccountNumber());
        account.printTransactionHistory();
    }
}
