package HeadFirstJava.Chapter_5;


public class DiceRollGame4
{

    public static void main(String[] args)
    {

        // roll 5 dice
        Dice4 myDice = new Dice4();
//        int[] rolls;
//        rolls = myDice.rollDice();
//        myDice.determineWinner(rolls);

        // Test out combinations:
        int [] myRolls = {1, 2, 2, 2, 6};
        myDice.determineWinner(myRolls);

    }
}
