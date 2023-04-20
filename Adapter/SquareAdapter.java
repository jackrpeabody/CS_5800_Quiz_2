package Adapter;

// Adapter
public class SquareAdapter implements PaymentGateway {
    SquarePaymentGateway gateway;

    public SquareAdapter(SquarePaymentGateway gateway){
        this.gateway = gateway;
    }

    @Override
    public void processPayment() {
        String paymentDetails = this.gateway.getSquarePaymentDetails();
        System.out.println(paymentDetails);
    }
}