package Chapter4;

import java.util.Scanner;

/**
 * Program to display "Enter two characters: " to the console
 *
 * @author Raymond Luong
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("Enter two characters: ");
        Scanner input = new Scanner(System.in);
        String text = input.next();
        String FullMajor = "";
        switch (text.charAt(0)) {
            case 'M':
                FullMajor = ("Mathematics ");
                break;
            case 'C':
                FullMajor = ("Computer Science ");
                break;
            case 'I':
                FullMajor = ("Information Technology ");
                break;
            default:
                System.out.println("Invalid Input");
                System.exit(0);
                break;
        }
        switch (text.charAt(1)) {
            case '1':
                FullMajor = FullMajor + "Freshman";
                break;
            case '2':
                FullMajor = FullMajor + "Sophmore ";
                break;
            case '3':
                FullMajor = FullMajor + "Junior";
                break;
            case '4':
                FullMajor = FullMajor + "Senior";
                break;
            default:
                FullMajor = ("Invalid Input");
                break;
        }
        System.out.println(FullMajor);
    }
}
