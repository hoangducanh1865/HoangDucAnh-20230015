import java.util.ArrayList;

public class BankAccount {
    private String accountHolderName;
    private double currentBalance;
    private double monthlyInterestRate;
    private ArrayList<Transaction> transactionHistoryList;
    private int withdrawalCount;
    private final int MAX_WITHDRAWALS = 3;

    public BankAccount(String accountHolderName, double currentBalance, double monthlyInterestRate) {
        this.accountHolderName = accountHolderName;
        this.currentBalance = currentBalance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.transactionHistoryList = new ArrayList<>();
        this.withdrawalCount = 0;
        System.out.println("Ten chu tai khoan moi: " + accountHolderName);
        System.out.println("So du ban dau: " + String.format("%,.0f", currentBalance) + " VND");
    }

    public void deposit(double amount) {
            currentBalance += amount;
            transactionHistoryList.add(new Transaction("Deposit", amount));
            System.out.println("Da gui " + String.format("%,.0f", amount) + " VND");
    }

    public void withdraw(double amount) {
        if (withdrawalCount < MAX_WITHDRAWALS) {
            if (amount <= currentBalance) {
                currentBalance -= amount;
                withdrawalCount++;
                transactionHistoryList.add(new Transaction("Rut", amount));
                System.out.println("Da rut " + String.format("%,.0f", amount) + " VND");
            } else {
                System.out.println("Rut " + String.format("%,.0f", amount) + " VND - Loi: So tien rut vuot qua so du.");
            }
        } else {
            System.out.println("Rut " + String.format("%,.0f", amount) + " VND - Loi: ban da dat den gioi han rut tien thang nay.");
        }
    }

    public void applyMonthlyInterest() {
        double interest = currentBalance * monthlyInterestRate;
        currentBalance += interest;
        transactionHistoryList.add(new Transaction("Lai", interest));
        System.out.println("So du sau khi cong lai: " + String.format("%,.0f", currentBalance) + " VND");
    }

    public void printTransactionHistory() {
        System.out.println("\nLich su giao dich:");
        for (int i = 0; i < transactionHistoryList.size(); i++) {
            System.out.println((i + 1) + ". " + transactionHistoryList.get(i).toString());
        }
    }

    public void printBalance() {
        System.out.println("So du hien tai: " + String.format("%,.0f", currentBalance) + " VND");
    }
}