package Adapter;

// Adaptee
public class PayPalPaymentGateway {
    
    private double paymentAmount;
    private String userEmail;

    public PayPalPaymentGateway(double paymentAmount, String userEmail){
        this.paymentAmount = paymentAmount;
        this.userEmail = userEmail;
    }

    public String getPayPalPaymentDetails(){
        return "PayPal processed the payment of $" + this.paymentAmount + " for the user with the email " + this.userEmail + ".\n";
    }
}