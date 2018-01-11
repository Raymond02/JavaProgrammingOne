package Chapter2;

import java.util.Scanner;

/**
 * Program to display "Enter the radius and length of a cylinder:" to the console
 *
 * @author Raymond Luong
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//ask question
        System.out.print("Enter the radius and length of a cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
//formula for problem
        double area = radius * radius * Math.PI;
        double volume = area * length;
//solution
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
