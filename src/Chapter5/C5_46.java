package Chapter5;

import java.util.Scanner;

/**
 * Program to display "Enter a string: "
 *
 * @author Raymond Luong
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");

        String word = input.next();
        String reverse = ("");

        for (int x = word.length() - 1; x >= 0; x--) {
            reverse += word.charAt(x);
        }

        System.out.println("The reverse string is: " + reverse);

    }
}
