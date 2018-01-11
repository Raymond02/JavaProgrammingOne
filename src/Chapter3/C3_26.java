package Chapter3;

import java.util.Scanner;

/**
 * Program to display "Enter an integer: " to the console
 *
 * @author Raymond Luong
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        System.out.print("Is 10 divisible by 5 and 6? ");
        if (answer % 5 == 0 && answer % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.print("Is 10 divisible by 5 or 6? ");
        if (answer % 5 == 0 || answer % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.print("Is 10 divisible by 5 or 6 but not both? ");
        if (answer % 5 == 0 ^ answer % 6 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
