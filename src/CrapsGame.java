import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);

        int die1 = 0;
        int die2 = 0;
        int dieSum = 0;
        int thePoint = 0;
        boolean playAgain = true;


        die1 = rand.nextInt(1,7);
        die2 = rand.nextInt(1,7);
        dieSum = die1 + die2;

        do {
            System.out.print("\nYou roll two dice!");
            if (dieSum == 2 || dieSum == 3 || dieSum == 12) {   //crapping out
                System.out.printf("\nYour first roll was %d and your second roll was %d. Your combined roll was %d", die1, die2, dieSum);
                System.out.print("Unfortunately, you crapped out!");
            }
            else if (dieSum == 7 || dieSum == 11) {  //natural win
                System.out.printf("\n Your first roll was %d and your second roll was %d. Your combined roll was %d", die1, die2, dieSum);
                System.out.print("Fortunately, you rolled a natural win!");
            }
            else { //the point option
                thePoint = dieSum;
                System.out.printf("\n Your first roll was %d and your second roll was %d. Your combined roll was %d", die1, die2, dieSum);
                System.out.printf("\nYour point is %d", thePoint);
                System.out.print("\n");

                boolean pointOrSeven = false;
                while (!(pointOrSeven)) {
                    int die1 = 0;
                    int die2 = 0;
                    int dieSum = 0;

                    die1 = rand.nextInt(1,7);
                    die2 = rand.nextInt(1,7);
                    dieSum = die1 + die2;

                    System.out.printf("\nYour first roll was %d and your second roll was %d. Your combined roll was %d", die1, die2, dieSum);

                    if (dieSum == 7) {
                        boolean pointOrSeven = true;
                        System.out.print("\nUnfortunately, you seven'd out and lose!");
                    }
                    if (dieSum == thePoint) {
                        boolean pointOrSeven = true;
                        System.out.print("\nCongratulations, you rolled the point and win!");
                    }

                }
            }

            i
        } while (playAgain);
    }
}
