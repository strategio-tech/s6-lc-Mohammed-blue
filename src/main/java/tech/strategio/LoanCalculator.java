package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * 
     * @param ???
     * @return ???
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
//        int months = 3;
//        double loanAmount = 90 / 100D; // after taking 10% for 3 months;
//        // int payment;
//        int remainingLoan = 0;
//
//        for (int i = 0; i < months; i++) {
//            amount = (int) (loanAmount * amount);
//            System.out.println(amount);
//            remainingLoan = amount;
//        };
//
//        return remainingLoan;

        if(amount == 0) {
            return 0;
        }
        int balance = amount;
        int percent = 10;

        for (int i = 0; i < 3; i++) {
            int payment = balance / percent;
            balance = balance - payment;
        }

        return balance;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
