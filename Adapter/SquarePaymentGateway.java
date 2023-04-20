package Adapter;

// Adaptee
public class SquarePaymentGateway {
    
    private double paymentAmount;
    private int locationID;

    public SquarePaymentGateway(double paymentAmount, int locationID){
        this.paymentAmount = paymentAmount;
        this.locationID = locationID;
    }

    public String getSquarePaymentDetails(){
        return "Square processed the payment of $" + this.paymentAmount + " with the location ID " + this.locationID + ".\n";
    }
}