 public class CanaraBankAccount {

    static double balance;

    static double credit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Balance amount is: " + balance);
        }
		
        return balance;
    }

    static double debit(double amount) {
        if (amount > 0) {
            balance = balance - amount;
            System.out.println("Balance amount is: " + balance);
        }
		else
			System.out.println("Insufficient Balance");
        return balance;
    }

    static double getBalance() {
        return balance;
    }
}
 