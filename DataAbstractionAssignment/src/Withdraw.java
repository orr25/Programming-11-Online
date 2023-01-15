import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    //Requires: double, Date, String
    //Modifies: this.amount this.date this.account
    //Effects:  Assigns values to class instance variables
    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Requires: nothing
    //Modifies: nothing
    //Effects:  Returns a string message with deposit amount, date, and type of account
    public String toString(){
        //your code here
        String message = "Withdraw of: $" + amount + " Date: " + date.toString() + " into Account: "
                + account;
        return message;
    }
}
