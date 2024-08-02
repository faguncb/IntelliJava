package org.example;
import java.util.Scanner;

public class ATMExample {

    public static void main(String[] args) {
        int initialBalance = 10000;
        int creditAmount = 5000;
        int debitAmount = 5000;
        int firstBalance, remainingBalance;
        String nameOfAcHolder = "Fagun Bhavsar";
        Scanner option = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = option.nextInt();

        if (choice >= 4) {
            System.out.println("Invalid choice! Please enter number between 0 to 3");
        } else if (choice == 0) {
            System.out.println("Thanks for using the service! Goodbye!");
            System.exit(0);
        } else if (choice == 1) {
            System.out.println("The Initial balance of " + nameOfAcHolder + " is: " + initialBalance);
        } else if (choice == 2) {
            System.out.println("Want to debit amount: " + debitAmount);
            firstBalance = initialBalance - debitAmount;
            System.out.println("The balance is: " + firstBalance);
        } else if (choice == 3) {
            System.out.println("Want to credit amount: " + creditAmount);
            remainingBalance = (initialBalance - debitAmount) + creditAmount;
            System.out.println("The balance is: " + remainingBalance);
        }
    }
}
//        if (choice == 1) {
//            switch (choice) {
//                case 1:
//                    System.out.println("The Initial balance of " + nameOfAcHolder + " is: " + initialBalance);
//                    break;
//                case 2:
//                    System.out.println("Want to debit amount: " + debitAmount);
//                    firstBalance = initialBalance - debitAmount;
//                    System.out.println("The balance is: " + firstBalance);
//                    break;
//                case 3:
//                    System.out.println("Want to credit amount: " + creditAmount);
//                    remainingBalance = (initialBalance - debitAmount) + creditAmount;
//                    System.out.println("The balance is: " + remainingBalance);
//                    break;
//                default:
//                    System.out.println("Thanks for using the service! Goodbye!");
//                    System.exit(0);
//                    break;
//            }
//            choice++;








