class BankAccount {
    public String accountHolder;
    protected double balance;
    private String password;

    public BankAccount(String holder, double amount, String pwd) {
        accountHolder = holder;
        balance = amount;
        password = pwd;
    }

    protected void deposit(double amount) {
        balance += amount;
    }

    private void resetPassword(String newPwd) {
        password = newPwd;
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("John", 1000, "secret123");
        acc.accountHolder = "John Doe";
        acc.deposit(500);
    }
}
