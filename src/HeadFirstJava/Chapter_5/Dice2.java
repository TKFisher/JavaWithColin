package HeadFirstJava.Chapter_5;


public class Dice2
{
    // returns a random number between 1 & 6
    public int rollDice()
    {
        int random = (int) (Math.random() * 6 + 1);
        return random;
    }


    /*

    Output the result to the console including the dice values:  “You have one pair”,  “You have two pairs”, “You have Yahtzee"
        Bonus - check for 3 of a kind, check for s “straight”(1,2,3,4,5,6) *and check for a "full-house”(1 pair plus a three of a kind)

        - one pair     (11)
        - two pairs    (11, 11)
        - Yahtzee      (11111)
        - 3 of a kind  (111)
        - straight     (1 2 3 4 5)
        - full house   (11 222)
*/

    public int determineWinner(int[] diceRolls)
    {

        int sumOfDice = 0;
        for (int i = 0; i <= diceRolls.length - 1; i++) {

            diceRolls[0] = diceRolls[i];
            diceRolls[1] = diceRolls[i];
            diceRolls[2] = diceRolls[i];
            diceRolls[3] = diceRolls[i];
            diceRolls[4] = diceRolls[i];

            sumOfDice += diceRolls[i];
            System.out.println((diceRolls[i]) + " = " + sumOfDice);

        }

        if (diceRolls[0] == diceRolls[1] &&
                diceRolls[1] == diceRolls[3] &&
                diceRolls[3] == diceRolls[4] &&
                diceRolls[4] == diceRolls[5])

        {
            System.out.println("Yatzee");

        } else if (diceRolls[0] != diceRolls[1] && diceRolls[0] != diceRolls[2] && diceRolls[1] != diceRolls[2]) {
            System.out.println("you hava a straight.");
        } else {
        }


        System.out.println("The sum of 3 rolls equals: " + sumOfDice);
        return sumOfDice;
    }

}

