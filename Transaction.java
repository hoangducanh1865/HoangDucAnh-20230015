import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private String type;
    private double amount;
    private String date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public String toString() {
        return type + " - " + String.format("%,.0f", amount) + " VND - " + date;
    }
}