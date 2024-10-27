public class Main {
    public static void main(String[] args) {
        // Tao tai khoan moi voi ten chu so huu la " Nguyen Van A" va so du ban dau la 5000000 VNĐ
        BankAccount account = new BankAccount("Nguyen Van A", 5000000, 0.0055);

        // Thuc hien mot so giao dich
        account.deposit(1000000);
        account.withdraw(500000);
        account.withdraw(500000);
        account.withdraw(500000);
        account.withdraw(500000);
        account.withdraw(500000);


        // Hien thi so du hien tai
        account.printBalance();

        // Ap dung lai suat hang thangs
        account.applyMonthlyInterest();

        // Hien thi lich su giao dich
        account.printTransactionHistory();
    }
}
