class Account {
    void display() {
        System.out.println("Basic account details");
    }
}

class SavingsAccount extends Account {
    @Override
    void display() {
        super.display();
        System.out.println("Savings account details");
    }
}

public class BankOperations {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();
        acc.display();
    }
}
