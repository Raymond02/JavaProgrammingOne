package Chapter4;

import java.util.Scanner;

/**
 * Program to display "Enter employee's name:" to the console
 *
 * @author Raymond Luong
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name:");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate:");
        double hourlyPR = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        double Grosspay = (hours * hourlyPR);
        double federalTaxtotal = (federalTax * 100);
        double stateTaxtotal = (stateTax * 100);
        double federalcost = (Grosspay * federalTax);
        double statecost = (Grosspay * stateTax - .01);
        double total = (statecost + federalcost);
        double netPay = (Grosspay - total - .02);
        System.out.printf("\tEmployee Name: %s\n", name);
        System.out.printf("Hours Worked: %.0f\n", hours);
        System.out.printf("Pay Rate: %.2f\n", hourlyPR);
        System.out.printf("Gross Pay: %.1f\n", Grosspay);
        System.out.println("Deductions:");
        System.out.printf("\tFederal Withholding (%.1f%%): $%.1f\n", federalTaxtotal,
                federalcost);
        System.out.printf("\tState Withholding (%.1f%%): $%.2f\n", stateTaxtotal, statecost);
        System.out.printf("\tTotal Cost: $%.2f\n", total);
        System.out.printf("Net Pay: $%.2f\n", netPay);
    }
}
