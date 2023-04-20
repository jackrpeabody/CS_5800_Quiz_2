package Adapter;

public class Driver {
    
    public static void main(String[] args){
        
        // Adaptees
        PayPalPaymentGateway payPalPaymentGateway = new PayPalPaymentGateway(100.0, "hello@cpp.edu");
        StripePaymentGateway stripePaymentGateway = new StripePaymentGateway(50.0, "John Doe", "1111-2222-3333-4444", "01/2030");
        SquarePaymentGateway squarePaymentGateway = new SquarePaymentGateway(1.00, 1);

        // Adapters
        PayPalAdapter payPalAdapter = new PayPalAdapter(payPalPaymentGateway);
        printPaymentProcess(payPalAdapter);
        StripeAdapter stripeAdapter = new StripeAdapter(stripePaymentGateway);
        printPaymentProcess(stripeAdapter);
        SquareAdapter squareAdapter = new SquareAdapter(squarePaymentGateway);
        printPaymentProcess(squareAdapter);
    }

    public static void printPaymentProcess(PaymentGateway paymentGateway){
        paymentGateway.processPayment();
    }
}
