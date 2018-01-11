package Chapter6;

import java.util.Scanner;

/**
 * Program to display "How many Euros does a dollar buy?: "
 *
 * @author Raymond Luong
 */
public class P6 {
 
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //declaring variables
        Scanner scan = new Scanner(System.in);
        boolean Change = true;
        double Euro, Pound, Yen;
        String Exchange;
        double Dollars;
        double finalPrice = 0;
        System.out.print("How many Euros does a dollar buy?: ");
        Euro = scan.nextDouble();
        System.out.print("How many Pounds does a dollar buy?: ");
        Pound = scan.nextDouble();
        System.out.print("How many Yen does a dollar buy?: ");
        Yen = scan.nextDouble();
        //asking numbers and which currency to convert
        while (Change = true) {
            System.out.print("Please enter the number of dollars you want to convert: $");
            Dollars = scan.nextDouble();
            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen:  ");
            Exchange = scan.next();
            Exchange = Exchange.toUpperCase();

            if (Exchange.equals("E")) {
                finalPrice = Convert(Dollars, Euro);
            }

            if (Exchange.equals("P")) {
                finalPrice = Convert(Dollars, Pound);
            }
            if (Exchange.equals("Y")) {
                finalPrice = Convert(Dollars, Yen);
            }
            System.out.printf("%.2f USD when converted is %.2f", Dollars, finalPrice);
            //asking if more convertions are needed
            while (1 == 1) {
                Scanner input = new Scanner(System.in);
                System.out.print("\n Are there more conversions to perform? Yes or NO :  ");
                String keepgoingString = input.nextLine();

                if ("yes".equals(keepgoingString)) {
                    break;
                } else if ("no".equals(keepgoingString)) {
                    System.exit(0);
                    break;

                }
            }
        }
    }

    //method for converting selected currency to american dollars
    public static double Convert(double Dollars, double Exchange) {
        if (Dollars >= 100.00) {
            Dollars = Dollars - (Dollars * .05);
        }
        if (Dollars < 100.00) {
            Dollars = Dollars - (Dollars * .10);
        }

        double finalPrice = Dollars * Exchange;
        return finalPrice;
    }
}
