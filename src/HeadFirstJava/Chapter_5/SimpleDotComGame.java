package HeadFirstJava.Chapter_5;

import java.util.Scanner;

public class SimpleDotComGame
{

    public static void main(String[] args)
    {
        int numOfGuesses = 0;

        Scanner scan = new Scanner(System.in);

        // creating the SimpleDotCom object
        SimpleDotCom myDot = new SimpleDotCom();

        // returns a value between 0 an 4.999 which is (1, 2, 3, 4) because the (int) chops off the double.
        int randNumber = (int) (Math.random() * 5);

        // setting 3 values in the array
        int[] locations = {randNumber, randNumber + 1, randNumber + 2};

        // setting the 3 locations
        myDot.setLocationCells(locations);


        boolean isAlive = true;

        while (isAlive == true) {

            System.out.println("Enter number between 0 - 7.");
            String guess = scan.nextLine();
            String result = myDot.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;

                System.out.println("You took " + numOfGuesses + " guesses.");
            }
        }

    }
}
