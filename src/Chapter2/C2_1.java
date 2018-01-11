package Chapter2;

import java.util.Scanner;

/**
 * Program to display "Enter Celsius:" to the console
 *
 * @author Raymond Luong
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//ask question
        System.out.print("Enter Celsius:");
        double celsius = input.nextDouble();
//formula for c to f
        double fahrenheit = (9.0 / 5 * celsius + 32);
        System.out.print(+celsius + " celsius into fahrenheit is " + fahrenheit);
    }
}
