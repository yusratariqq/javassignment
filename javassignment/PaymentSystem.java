class Payment {
    void processPayment() {
        System.out.println("Processing generic payment");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment");
    }
}

class UPIPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing UPI payment");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment pay1 = new CreditCardPayment();
        Payment pay2 = new UPIPayment();

        pay1.processPayment();
        pay2.processPayment();
    }
}
