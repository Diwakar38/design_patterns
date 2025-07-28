package designpatterns.Behavioral.Strategy;

class PaymentServiceOld {
    public void processPayments(String paymentMethod){
        if(paymentMethod.equals("CreditCard")) {
            System.out.println("Making payment via Credit Card");
        } else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Making payment via Debit Card");
        } else {
            System.out.println("Unsupported method");
        }
    }
}

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        PaymentServiceOld paymentService = new PaymentServiceOld();

        paymentService.processPayments("CreditCard");
        paymentService.processPayments("DebitCard");
        paymentService.processPayments("UPI");
    }
}
