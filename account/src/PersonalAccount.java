import java.util.ArrayList;
import java.util.List;

public class PersonalAccount {
    private int accountNumber; // Номер счета
    private String accountHolder; // Имя владельца счета
    private double balance; // Текущий баланс
    private List<Amount> transactions;

    // Конструктор класса PersonalAccount
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber; // Инициализация номера счета
        this.accountHolder = accountHolder; // Инициализация имени владельца
        this.balance = 0.0; // Начальный баланс = 0.0
        this.transactions = new ArrayList<>(); // Создаем пустой список транзакций
    }

    // Метод для депозита средств на счет
    public void deposit(double amount) {
        if (amount <= 0) { // Проверяем что сумма депозита больше 0
            System.out.println("Сумма депозита должна быть положительной.");
            return;
        }
        transactions.add(new Amount(amount, TransactionType.DEPOSIT)); // Создаем объект Amount для депозита и добавляем в список транзакций
        balance += amount; // Увеличиваем баланс на сумму депозита
        System.out.println("Зачислено $" + amount);
    }

    // Метод для снятия средств со счета
    public void withdraw(double amount) {
        if (amount <= 0) { // Проверяем, что сумма снятия больше 0
            System.out.println("Сумма снятия должна быть положительной.");
            return;
        }
        if (amount > balance) { // Проверяем, что на счете достаточно средств для снятия
            System.out.println("Недостаточно средств.");
            return;
        }
        transactions.add(new Amount(amount, TransactionType.WITHDRAWAL)); // Создаем объект Amount для снятия и добавляем в список транзакций
        balance -= amount; // Уменьшаем баланс на сумму снятия
        System.out.println("Снято $" + amount);
    }

    // Метод для печати истории транзакций
    public void printTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("Нет доступных транзакций.");
            return;
        }
        for (Amount transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // Метод для получения текущего баланса
    public double getBalance() {
        return balance;
    }

    // Метод для получения номера счета
    public int getAccountNumber() {
        return accountNumber;
    }

    // Метод для получения имени владельца счета
    public String getAccountHolder() {
        return accountHolder;
    }
}
