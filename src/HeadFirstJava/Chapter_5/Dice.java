package HeadFirstJava.Chapter_5;


public class Dice
{
    // returns a random number between 1 & 6
    public int rollDice()
    {
        int random3 = (int) (Math.random() * 6 + 1);
        // System.out.println(random3);
        return random3;
    }

    /*
     * Create determineWinner method
     * 1. Inside determineWinner add the sum of the three dice together and print out to the console
     * 2. Inside determineWinner if the three dice are the same value then print out a new statement
     * to the console “Yahtzee!"
     */

    public int determineWinner(int[] diceRolls)
    {

        int sumOfDice = 0;
        for (int i = 0; i <= diceRolls.length - 1; i++) {
            sumOfDice += diceRolls[i];
            System.out.println( (diceRolls[i]) + " = " + sumOfDice);
        }

        if (diceRolls[0] == diceRolls[1] && diceRolls[0] == diceRolls[2] && diceRolls[1] == diceRolls[2]) {
            System.out.println("Yatzee");

        } else if (diceRolls[0] != diceRolls[1] && diceRolls[0] != diceRolls[2] && diceRolls[1] != diceRolls[2]) {
            System.out.println("sorry, no pairs");

        } else {
            System.out.println("You got pairs!");
        }

        System.out.println("The sum of 3 rolls equals: " + sumOfDice);
        return sumOfDice;
    }

}

