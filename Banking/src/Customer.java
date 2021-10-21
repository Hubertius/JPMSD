import java.util.ArrayList;

public class Customer {
    // write code here

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initTransaction);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(double valueOfTransaction) {
        this.transactions.add(Double.valueOf(valueOfTransaction));
    }


}