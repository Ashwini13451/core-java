public class CanaraBankAccountExecuter {
    public static void main(String[] args) {

        CanaraBankAccount.credit(5000);
        CanaraBankAccount.debit(4000);

        double bal = CanaraBankAccount.getBalance();
        System.out.println("Final Balance: " + bal);
    }
}