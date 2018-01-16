package Chapter6;

import java.util.Scanner;

/**
 * Program to display "Enter a password: "
 *
 * @author Raymond Luong
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String pw = input.nextLine();

        if (check(pw)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    /**
     * Method check
     *
     * @param PW the string we are checking
     * @return true/false based of if password is valid
     */
    public static boolean check(String PW) {
        boolean isValid = true;
        if (PW.length() < 8) {
            isValid = false;
            System.out.println("A Password must have atleast eight characters");
        } else {
            int numberOfDigit = 0;
            for (int i = 0; i < PW.length(); i++) {
                if (Character.isDigit(PW.charAt(i))) {
                    ++numberOfDigit;
                }
                if (Character.isLetterOrDigit(PW.charAt(i))) {
                    isValid = true;
                } else {
                    isValid = false;
                    System.out.println("A password must only consist letters and digits");
                    break;
                }
            }
            if (numberOfDigit < 2) {
                isValid = false;
                System.out.println("A password must contain atleast 2 digits");
            }
        }
        return isValid;
    }
}
