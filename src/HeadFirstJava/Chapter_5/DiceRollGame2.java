package HeadFirstJava.Chapter_5;

/* Homework:

    Add the following functionality to your Dice Game:
        Change the number of dice to 5
        Detect if you have 1 pair 2 pair, or Yahtzee (5 of a kind)
        Output the result to the console including the dice values:  “You have one pair”,  “You have two pairs”, “You have Yahtzee"
        Bonus - check for 3 of a kind, check for s “straight”(1,2,3,4,5,6) *and check for a "full-house”(1 pair plus a three of a kind)

        // roll dice 5 times
        // store the 5 rolls
        // determine hand
 */


import java.util.Arrays;

public class DiceRollGame2
{

    public static void main(String[] args)
    {

        // Create 5 instances of Dice2
        Dice2[] myDice = new Dice2[5];

        // 5 Dice objects
        myDice[0] = new Dice2();
        myDice[1] = new Dice2();
        myDice[2] = new Dice2();
        myDice[3] = new Dice2();
        myDice[4] = new Dice2();


        // 5 Dice objects
        int[] storedDiceRolls = new int[myDice.length];


        //Roll dice 5 times and store results
        for (int i = 0; i < myDice.length; i++) {
            //int[] storedDiceRolls = new int[5];
            storedDiceRolls[i] = myDice[i].rollDice();


            // System.out.println("Roll of dice = " + Arrays.toString(storedDiceRolls));

        }
        System.out.println("Roll of dice = " + Arrays.toString(storedDiceRolls));
    }


}
