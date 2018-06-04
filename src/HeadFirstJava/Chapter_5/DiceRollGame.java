package HeadFirstJava.Chapter_5;

/* Homework:
* In class example
* Create a DiceRollGame class that holds game logic
*
* Create a Dice class
* Inside DiceRollGame create 3 Dice objects
*
* Inside Dice class create a rollDice method that calculates a random number between 1 & 6
int random3 = (int)(Math.random()*6+1);

* Create determineWinner method:
    * Inside determineWinner add the sum of the three dice together and print out to the console
    * Inside determineWinner if the three dice are the same value then print out a new statement
    * to the console “Yahtzee!"
*
* BONUS: Incorporate an array for the values of the dice 1-6 and use a For or enhanced For
* loop to determine 3 random values instead.
*
* */


import HeadFirstJava.Chapter_5.Dice;

public class DiceRollGame
{

    public static void main(String[] args)
    {

        // Declare a Dice array variable 'myDice'.
        Dice[] myDice = new Dice[3];

        // 3 Dice objects:
        myDice[0] = new Dice();
        myDice[1] = new Dice();
        myDice[2] = new Dice();


        // 1. Loop through the myDice objects to generate a random number between 1-6 using the rollDice() method.
        // 2. Store the random numbers and using the determineWinner() method add the sums of the numbers
        // and check to see if all numbers are the same...if so, print Yatzee!

        int[] storedDiceRolls = new int[myDice.length];

        // roll the dice and store the values of the roll
        for (int i = 0; i < myDice.length; i++) {
            storedDiceRolls[i] = myDice[i].rollDice();
        }

        // determine winner from stored rolls

//        for (int i = 0; i < storedDiceRolls.length; i++){
//            myDice[i].determineWinner(storedDiceRolls);
//        }

        Dice myWinner = new Dice();
        myWinner.determineWinner(storedDiceRolls);

    }

}
