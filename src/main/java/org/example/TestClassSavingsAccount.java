
public class TestClassSavingsAccount {
    public static void main(String [] args){
        SavingsAccount saver1 = new SavingsAccount(5000, 4.5);
        SavingsAccount saver2 = new SavingsAccount(6000, 4.5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("The Monthly Interest of saver 1 is: " +saver1.getSavingBalance());
        System.out.println("The Monthly Interest of saver 2 is: " +saver2.getSavingBalance());

        System.out.println("");

        SavingsAccount.modifyInterestRate(5.025);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("The Monthly Interest of saver 1 is: " +saver1.getSavingBalance());
        System.out.println("The Monthly Interest of saver 2 is: " +saver2.getSavingBalance());
    }
}
