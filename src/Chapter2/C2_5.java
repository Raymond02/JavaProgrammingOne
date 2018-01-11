package Chapter2;

import java.util.Scanner;

/**
 * Program to display "Enter the Subtotal and Gratuity rate:" to the console
 *
 * @author Raymond Luong
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Subtotal and Gratuity rate:");
        double Subtotal = input.nextDouble();
        double GratuityRate = input.nextDouble();
        double subtotal = (Subtotal * (GratuityRate / 100));
        double total = (subtotal + Subtotal);
        System.out.println("The gratuity is $" + subtotal + " and total is $" + total);
    }
}
