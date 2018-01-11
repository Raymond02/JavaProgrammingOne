package Chapter3;

import java.util.Scanner;

/**
 * Program to display "Enter weight and price for package1: " to the console
 *
 * @author Raymond Luong
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter weight and price for package1: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double price = input.nextDouble();
        double totalone = (price / weight);
        System.out.println("Enter weight and price for package2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double totaltwo = (price2 / weight2);
        if (totalone < totaltwo) {
            System.out.println("Package 1 has a better price");
        } else if (totalone > totaltwo) {
            System.out.println("Package 2 has a better price");
        } else if (totalone == totaltwo) {
            System.out.println("Both packages are equal in price to weight");
        }
    }
}
