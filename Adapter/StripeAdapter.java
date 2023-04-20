package Adapter;

// Adapter
public class StripeAdapter implements PaymentGateway {
    StripePaymentGateway gateway;

    public StripeAdapter(StripePaymentGateway gateway){
        this.gateway = gateway;
    }

    @Override
    public void processPayment() {
        String paymentDetails = this.gateway.getStripePaymentDetails();
        System.out.println(paymentDetails);
    }
}