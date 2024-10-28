public class PersonalAccountTest {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(322, "Gyrokopter");

        // Test deposit
        account.deposit(100);
        assert account.getBalance() == 100 : "Deposit test failed";

        // Test withdrawal
        account.withdraw(50);
        assert account.getBalance() == 50 : "Withdrawal test failed";

        // Test insufficient withdrawal
        account.withdraw(100);
        assert account.getBalance() == 50 : "Insufficient withdrawal test failed";

        // Test transaction history
        account.printTransactionHistory();
    }
}
