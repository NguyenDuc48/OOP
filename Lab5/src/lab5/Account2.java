package lab5;

public class Account2 {
    private int id;
    private Customer2 customer;
    private double balance = 0;

    public Account2(int id, Customer2 customer) {
        this.id = id;
        this.customer = customer;
    }

    public Account2(int id, Customer2 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer2 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer.toString() + " blance= $" + balance;
    }

    public Account2 deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account2 withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this;
    }
}
