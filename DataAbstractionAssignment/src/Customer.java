import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
    }

    //Requires: double, int, double, double
    //Modifies: this
    //Effects:  Assigns account name, account number, and starting values of accounts
    //          Initialize the deposits ArrayList, and withdraws Arraylist
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        //constructor code here
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
        this.deposits = new ArrayList<Deposit>();
        this.withdraws = new ArrayList<Withdraw>();
    }

    //Requires: double, Date, String
    //Modifies: this.checkBalance, this.savingBalance, this.deposits
    //Effects: Creates new deposit object, and adds it to the deposits arrayList
    //         and adds the amount to the corresponding account (checking or savings)
    //         Returns 1 if successful; otherwise returns 0;
    public double deposit(double amt, Date date, String account){
        //your code here
        Deposit d = new Deposit (amt, date, account);
        deposits.add(d);
        if (account.equals(CHECKING)){
            checkBalance += amt;
            System.out.println(d.toString());
            System.out.println("Current Balance in " + account + " is: $" + this.checkBalance);
            return 1;
        } else if (account.equals(SAVING)){
            savingBalance += amt;
            System.out.println(d.toString());
            System.out.println("Current Balance in " + account + " is: $" + this.savingBalance);
            return 1;
        }
        return 0;
    }

    //Requires: double, Date, String
    //Modifies: this.checkBalance,  this.savingBalance, this.withdraws
    //Effects:  Creates new withdraw object, and adds it to the deposits arrayList
    //          and subtracts the amount to the corresponding account (checking or savings)
    //          Returns 1 if successful; otherwise returns 0.
    public double withdraw(double amt, Date date, String account){
        //your code here
        if (!checkOverdraft(amt, account)) {
            Withdraw w = new Withdraw(amt, date, account);
            withdraws.add(w);
            if (account.equals(CHECKING)) {
                checkBalance -= amt;
                System.out.println(w.toString());
                System.out.println("Current Balance in " + account + " is: $" + this.checkBalance);
            } else if (account.equals(SAVING)) {
                savingBalance -= amt;
                System.out.println(w.toString());
                System.out.println("Current Balance in " + account + " is: $" + this.savingBalance);
            }
            return 1;
        } else {
            System.out.println("ERROR --- OVERDRAFT -- withdraw failed.");
            return 0;
        }
    }

    //Requires: double, String (account)
    //Modifies: nothing
    //Effects: Returns true if account's balance minus amt is less than overdraft value
    //         otherwise it returns false.
    private boolean checkOverdraft(double amt, String account){
        //your code here
        if (account.equals(CHECKING)){
            if (checkBalance-amt < OVERDRAFT) {
                return true;
            }
        } else if (account.equals(SAVING)){
            if (savingBalance-amt < OVERDRAFT){
                return true;
            }
        }
        return false;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
