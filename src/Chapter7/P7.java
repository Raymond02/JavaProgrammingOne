package Chapter7;

import java.util.Scanner;

/**
 * Program to find average
 *
 * @author Raymond Luong
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be read? ");
        int amount = input.nextInt();
        double[] myList = new double[amount];
        fillArray(myList, input);
        System.out.printf("The average is %4.1f\n", average(myList));
        displayArray(myList);
    }

    /**
     * method to find the minimum
     *
     * @param myList original data
     * @param input user input
     */
    //Filling the array
    public static void fillArray(double[] myList, Scanner input) {
        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }
    }

    /**
     * method to find the minimum
     *
     * @param myList original data
     * @return average average of lists
     */
    //Calculating the average
    public static double average(double[] myList) {
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        double average = (total / (myList.length));
        return average;
    }

    /**
     * method to find the minimum
     *
     * @param myList original data
     *
     */
    //Displaying the array
    public static void displayArray(double[] myList) {
        System.out.println("The contents of the array are: ");
        System.out.println(java.util.Arrays.toString(myList));
    }
}
