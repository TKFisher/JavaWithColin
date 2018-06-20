package HeadFirstJava.Chapter_5;

import java.util.Arrays;

public class Dice6
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

        boolean yatzee = false;
        int pairs = 0;
        int threes = 0;
        int straightpart = 0;


        if (diceRolls[0] == diceRolls[1] &&
                diceRolls[1] == diceRolls[2] &&
                diceRolls[2] == diceRolls[3] &&
                diceRolls[3] == diceRolls[4]) {
            yatzee = true;
            System.out.println("Yatzee!!");
            return;
        }

        Arrays.sort(diceRolls);

        // Pairs
        for (int i = 1; i < diceRolls.length; i++) {

            if (diceRolls[i - 1] == diceRolls[i]) {
                pairs++;
                ++i;
            }
        }
        if (pairs >= 1) {
            System.out.println("You have pairs.");
        }


        // Three of a kind
        for (int i = 2; i < diceRolls.length; i++) {

            if ((diceRolls[i - 2] == diceRolls[i - 1]) && (diceRolls[i - 1] == diceRolls[i])) {
                threes++;
                i = i + 2;
            }
            if (threes == 1) {
                System.out.println("You have three of a kind.");
            }
        }


        // Straight
        for (int i = 0; i < diceRolls.length - 1; i++) {

            if (diceRolls[i] + 1 == diceRolls[i + 1]) {
                straightpart++;
            }
        }
        if (straightpart == 4) {
            System.out.println("You have a straight.");
        }

        // TODO: not working yet.
        if (threes == 1 && pairs == 1) {
            System.out.println("You have a full house. ");
        }
    }
}

