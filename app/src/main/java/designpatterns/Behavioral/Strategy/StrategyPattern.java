package designpatterns.Behavioral.Strategy;

interface PaymentStrategy {
    void processPayment();
}

class PaymentService {
    private PaymentStrategy strategy;
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void Pay() {
        strategy.processPayment();
    }
}
class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making payments via Credit Card");
    }
}

class DebitCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making payments via Debit Card");
    }
}

class UPI implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making payments via UPI");
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CreditCard());
        paymentService.Pay();
        paymentService.setPaymentStrategy(new DebitCard());
        paymentService.Pay();
        paymentService.setPaymentStrategy(new UPI());
        paymentService.Pay();
    }
}
