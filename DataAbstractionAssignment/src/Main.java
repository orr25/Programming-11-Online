import java.util.Date;

public class Main {
    public static void main (String[] args){

        //create a new customer called Bob who has no money in his accounts
        Customer bob = new Customer("Bilbo", 12345, 0.0, 0.0);

        //create a data object
        Date today = new Date();

        //deposit $100, $200 into savings
        //withdraw $10 for starbucks coffee
        bob.deposit(10000, today, Customer.SAVING);
        bob.deposit(200, today, Customer.SAVING);
        bob.withdraw(10,today, Customer.SAVING);
        bob.displayDeposits();
        bob.displayWithdraws();
        System.out.println(" ");

        //deposit 1000, 2000 into checking
        //withdraw 10 from checking, should be ok
        //withdraw 4000 from checking, should be denied
        bob.deposit(1000, today, Customer.CHECKING);
        bob.deposit(2000, today, Customer.CHECKING);
        bob.withdraw(10,today, Customer.CHECKING);
        bob.withdraw(4000,today,Customer.CHECKING);
        bob.displayDeposits();
        bob.displayWithdraws();

    }
}
