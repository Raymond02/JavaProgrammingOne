package Chapter5;

import java.util.Scanner;

/**
 * Program to display "scissor (0), rock (1), paper (2):"
 *
 * @author Raymond Luong
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int comwin = 0;
        int playerwin = 0;

        while (comwin <= 2 && playerwin <= 2) {
            System.out.print("scissor (0), rock (1), paper (2):");
            int playerg = input.nextInt();
            int computer = (int) (Math.random() * 3);
            String comg = "";
            switch (computer) {
                case 0:
                    comg = "scissor";
                    break;
                case 1:
                    comg = "rock";
                    break;
                case 2:
                    comg = "paper";
                    break;
            }
            String number = "";
            switch (playerg) {
                case 0:
                    number = "scissor";
                    break;
                case 1:
                    number = "rock";
                    break;
                case 2:
                    number = "paper";
                    break;
                default:
                    System.out.print("Invalid input.");
                    System.exit(0);
            }

            System.out.print("The computer is " + comg + ". You are "
                    + number);

            if (computer == playerg) {
                System.out.println(" too. It is a draw");
            } else if (computer - playerg == 1 || computer - playerg == -2) {
                System.out.println(". Computer won.");
                comwin++;
            } else if (computer - playerg == -1 || computer - playerg == 2) {
                System.out.println(". You won.");
                playerwin++;
            }
        }
        if (comwin >= 2) {
            System.out.println("The computer won more than two times");
            if (playerwin >= 2) {
                System.out.println("You won more than two times");
            }
        }
    }
}
