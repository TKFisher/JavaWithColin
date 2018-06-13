package HeadFirstJava.Chapter_5;

import java.util.Arrays;

public class Dice3
{

    public static int[] rollDice()
    {
        // the 'new' means, create a place in memory for a new array to hold 5 elements.
        int[] randomNumbers = new int[5];

        // loop through the 5 elements and create a random number.
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 6 + 1);
        }
        System.out.println("You've rolled = " + Arrays.toString(randomNumbers));
        return randomNumbers;
    }


/*
    Output the result to the console including the dice values:  “You have one pair”,  “You have two pairs”, “You have Yahtzee"
        Bonus - check for 3 of a kind, check for s “straight”(1,2,3,4,5,6) *and check for a "full-house”(1 pair plus a three of a kind)

        - one pair     (11)
        - two pairs    (11, 11)
        - Yahtzee      (11111)
        - 3 of a kind  (111)
        - straight     (1 2 3 4 5 OR: 2 3 4, 5, 6)
        - full house   (11 222)
*/


    public void determineWinner(int[] diceRolls)
    {

        int pairs = 0;


        if (diceRolls[0] == diceRolls[1] &&
                diceRolls[1] == diceRolls[2] &&
                diceRolls[2] == diceRolls[3] &&
                diceRolls[3] == diceRolls[4])

        {
            System.out.println("Yatzee!!");
        }

        Arrays.sort(diceRolls);
        for (int i = 1; i < diceRolls.length; i++) {

            // for (int j = i + 1; j < diceRolls.length; j++) {
            //if (diceRolls[i] == diceRolls[j]) {
            //System.out.println("duplicates = " + diceRolls[j]);

            if (diceRolls[i] == diceRolls[i - 1]) {
                pairs++;
                ++i;
            }
        }
        System.out.println("You have " + pairs + " pair(s).");
    }
}

