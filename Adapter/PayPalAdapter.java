package Adapter;

// Adapter
public class PayPalAdapter implements PaymentGateway {
    PayPalPaymentGateway gateway;

    public PayPalAdapter(PayPalPaymentGateway gateway){
        this.gateway = gateway;
    }

    @Override
    public void processPayment() {
        String paymentDetails = this.gateway.getPayPalPaymentDetails();
        System.out.println(paymentDetails);
    }
}