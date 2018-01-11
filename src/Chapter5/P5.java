package Chapter5;

import java.util.Scanner;

/**
 * Program to display "Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting:"
 *
 * @author Raymond Luong
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // assignments
        long votey = 0;
        long voten = 0;
        long votefail = 0;
        char userInput;
        boolean end = true;
        //Tally code
        while (end == true) {
            System.out.print("Enter ‘Y’ to vote yes, ‘N’ to vote no, or ‘Q’ to quit voting:");
            userInput = scan.next().charAt(0);
            switch (userInput) {
                case 'Y':
                    ++votey;
                    break;
                case 'y':
                    ++votey;
                    break;
                case 'N':
                    ++voten;
                    break;
                case 'n':
                    ++voten;
                    break;
                case 'Q':
                    end = false;
                    break;
                case 'q':
                    end = false;
                    break;
                default:
                    System.out.print("INVALID CODE:");
                    ++votefail;
                    break;
            }
        }
        //Revealing votes
        long Totalvotes = (votey + voten + votefail);
        System.out.printf("%nYes votes:\t %d", votey);
        System.out.printf("%nNo votes:\t %d", voten);
        System.out.printf("%nInvalid votes:\t %d", votefail);
        System.out.printf("%nTotal votes:\t %d", Totalvotes);
    }
}
