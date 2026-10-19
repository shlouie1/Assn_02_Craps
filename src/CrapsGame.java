import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class CrapsGame {
    public static void main(String[] args) {
        //initialize objects
        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);

        //intialize necessary variables
        int die1 = 0;
        int die2 = 0;
        int dieSum = 0;
        int thePoint = 0;
        boolean playAgain = true;
        String userAnswer = "";


        //logic for computing and outputting results of rolls
        do {
            //randomize dice and get the sum
            die1 = rand.nextInt(1,7);
            die2 = rand.nextInt(1,7);
            dieSum = die1 + die2;

            System.out.print("\nYou roll two dice!");
            if (dieSum == 2 || dieSum == 3 || dieSum == 12) {   //crapping out
                System.out.printf("\nYour first roll was %d and your second roll was %d. Your combined roll was %d", die1, die2, dieSum);
                System.out.print("\nUnfortunately, you crapped out!");
            }
            else if (dieSum == 7 || dieSum == 11) {  //natural win
                System.out.printf("\n Your first roll was %d and your second roll was %d. Your combined roll was %d", die1, die2, dieSum);
                System.out.print("\nFortunately, you rolled a natural win!");
            }
            else { //the point option
                thePoint = dieSum;
                System.out.printf("\nYour first roll was %d and your second roll was %d. Your combined roll was %d", die1, die2, dieSum);
                System.out.printf("\nYour point is %d", thePoint);
                System.out.print("\n");

                //while loop that repeats until seven or point is reached and displays results
                boolean pointOrSeven = false;
                while (!(pointOrSeven)) {
                    die1 = 0;
                    die2 = 0;
                    dieSum = 0;

                    die1 = rand.nextInt(1,7);
                    die2 = rand.nextInt(1,7);
                    dieSum = die1 + die2;

                    System.out.printf("\nYour first roll was %d and your second roll was %d. Your combined roll was %d", die1, die2, dieSum);

                    if (dieSum == 7) {
                        pointOrSeven = true;
                        System.out.print("\nUnfortunately, you seven'd out and lose!");
                    }
                    if (dieSum == thePoint) {
                        pointOrSeven = true;
                        System.out.print("\nCongratulations, you rolled the point and win!");
                    }
                }
            }

            //user input to play again or not
            System.out.print("\nWould you like to play again?(Y for yes): ");
            userAnswer = userInput.nextLine();
            if (!(userAnswer.equalsIgnoreCase("Y"))) {
                playAgain = false;
            }
            else { //reinitializes variables
                die1 = 0;
                die2 = 0;
                dieSum = 0;
                userAnswer = "";
                System.out.print("\n");
            }
        } while (playAgain);
    }
}
