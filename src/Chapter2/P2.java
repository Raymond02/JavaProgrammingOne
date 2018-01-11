package Chapter2;

import java.util.Scanner;

/**
 * Program to display "How much is the meal? " to the console
 *
 * @author Raymond Luong
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //asking user to input numbers
        System.out.println("How much is the meal? ");
        //storing the number user entered
        double food = input.nextDouble();
        System.out.println("How much is the drink? ");
        double drink = input.nextDouble();
        System.out.println("How much is the dessert? ");
        double dessert = input.nextDouble();
        // formulas for numbers they inputed
        double Meal = (food + drink + dessert);
        double Tax = (Meal * .1);
        double Tip = ((Meal + Tax) * .15);
        double Total = (Meal + Tax + Tip);
        //giving users the solution
        System.out.println("The Price of food is $" + Meal);
        System.out.println("The Price of the tax is $" + Tax);
        System.out.println("The Price of the tip is $" + Tip);
        System.out.println("The Price of the total is $" + Total);
    }
}
