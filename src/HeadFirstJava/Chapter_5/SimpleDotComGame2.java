package HeadFirstJava.Chapter_5;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleDotComGame2
{

    public static void main(String[] args)
    {

        int numOfGuesses = 0;

        Scanner sc = new Scanner(System.in);

        SimpleDotCom myDot = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum,randomNum + 1,randomNum + 2};
        System.out.println("The random locations are: " + Arrays.toString(locations));

        myDot.setLocationCells(locations);

        Boolean isAlive = true;

        while (isAlive == true) {

            String result = null;

            System.out.println("Enter a number.");
            String g = sc.nextLine();
            System.out.println(g);

            result = myDot.checkYourself(g);

            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                break;
            }

            System.out.println("You've guessed " + numOfGuesses + " times.");
        }
    }
}
