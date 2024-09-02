
public class SavingsAccount {
    private double SavingBalance;
    private static double annualInterestRate;

    public SavingsAccount(double SavingBalance, double annualInterestRate) {
        this.SavingBalance = SavingBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public void calculateMonthlyInterest(){
        double MonthlyInterest = (SavingBalance * annualInterestRate)/12;
        SavingBalance = SavingBalance + MonthlyInterest;
    }

    public static void modifyInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getSavingBalance() {
        return SavingBalance;
    }
}
