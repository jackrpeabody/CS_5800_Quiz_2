package Adapter;

// Adaptee
public class StripePaymentGateway {
    
    private double paymentAmount;
    private String cardHolderName;
    private String cardNumber;
    private String expirationDate;

    public StripePaymentGateway(double paymentAmount, String cardHolderName, String cardNumber, String expirationDate){
        this.paymentAmount = paymentAmount;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public String getStripePaymentDetails(){
        return "Stripe processed the payment of $" + this.paymentAmount + " for the card holder " + this.cardHolderName + " with the card number " + this.cardNumber + " which expires on " + this.expirationDate + ".\n";
    }
}