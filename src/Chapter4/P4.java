package Chapter4;

import java.util.Scanner;

/**
 * Program to display "The details asked below concern the first bidder Please
 * enter your name:" to the console
 *
 * @author Raymond Luong
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //asking questions
        System.out.println("The details asked below concern the first bidder ");
        System.out.print("Please enter your name: ");
        String B1 = input.next();

        System.out.print("How many hours of work will you require?  ");
        int hw1 = input.nextInt();

        System.out.print("How much do you charge per hour? $");
        double charge1 = input.nextDouble();

        System.out.printf("\nThe details asked below concern the second bidder ");
        System.out.print("\nPlease enter your name: ");
        String B2 = input.next();

        System.out.print("How many hours of work will you require? ");
        int hw2 = input.nextInt();

        System.out.print("How much do you charge per hour? $");
        double charge2 = input.nextDouble();
        //math
        double cost1 = (hw1 * charge1);
        double cost2 = (hw2 * charge2);
        //outputs depending on numbers given            
        if (cost1 < cost2) {
            System.out.printf("\nThe winner is %s \nTotal cost is $%.2f", B1, cost1);
        }
        if (cost1 > cost2) {
            System.out.printf("\nThe winner is %s \nTotal cost is $%.2f", B2, cost2);
        }

        if (cost1 == cost2 && hw1 < hw2) {
            System.out.printf("\nThe winner is %s \nTotal cost is $%.2f \nThe number of hours is %d", B1, cost1, hw1);
        }

        if (cost1 == cost2 && hw1 > hw2) {
            System.out.printf("\nThe winner is %s \nTotal cost is $%.2f \nThe number of hours is %d", B2, cost2, hw2);
        }

        if (cost1 == cost2 && hw1 == hw2 && hw1 > 1) {
            System.out.printf("\nBoth %s and %s have identical bids. \nNumber of hours: \nFirst bidder= %d \tSecond bidder= %d, \nCost per hour: \nFirst bidder= $%.2f \tSecond bidder= $%.2f \nTotal Cost: \nFirst bidder= $%.2f \tSecond bidder= $%.2f", B1, B2, hw1, hw2, charge1, charge1, cost1, cost1);
        }
        if (cost1 == cost2 && hw1 == hw2 && hw1 == 1) {
            System.out.printf("\nBoth %s and %s have identical bids. \nNumber of hours: \nFirst bidder= %d, \tSecond bidder= %d,  \nCost per hour: \nFirst bidder= $%.2f \tSecond bidder= $%.2f \nTotal Cost: \nFirst bidder= $%.2f \tSecond bidder= $%.2f", B1, B2, hw1, hw2, charge1, charge1, cost1, cost1);
        }
    }
}
