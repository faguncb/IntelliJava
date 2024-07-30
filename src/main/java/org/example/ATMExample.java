package org.example;

public class ATMExample {

    public static void main(String[] args) {
        int initialBalance = 10000;
        int creditAmount = 5000;
        int debitAmount = 5000;
        int firstBalance, remainingBalance;
        int choice = 1;
        String nameOfAcHolder = "Fagun Bhavsar";

        while (choice <= 4) {
            switch (choice) {
                case 1:
                    System.out.println("The Initial balance of " + nameOfAcHolder + " is: " + initialBalance);
                    break;
                case 2:
                    System.out.println("Want to debit amount: " + debitAmount);
                    firstBalance = initialBalance - debitAmount;
                    System.out.println("The balance is: " + firstBalance);
                    break;
                case 3:
                    System.out.println("Want to credit amount: " + creditAmount);
                    remainingBalance = (initialBalance - debitAmount) + creditAmount;
                    System.out.println("The balance is: " + remainingBalance);
                    break;
                default:
                    System.out.println("Thanks for using the service! Goodbye!");
                    System.exit(0);
                    break;
            }
            choice++;
        }


    }

}
