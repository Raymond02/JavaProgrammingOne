package Chapter3;

import java.util.Scanner;

/**
 * Program to display "Enter 1 for heads or 0 for tails?: " to the console
 *
 * @author Raymond Luong
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 for heads or 0 for tails?: ");
        int answer = input.nextInt();
        int Land = (int) (Math.random() * 2);
        if (Land == answer) {
            System.out.println("You are correct!It was " + Land);
        } else {
            System.out.println("You are incorrect! It was " + Land);
        }
    }
}
