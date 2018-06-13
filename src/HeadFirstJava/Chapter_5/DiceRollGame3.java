package HeadFirstJava.Chapter_5;


public class DiceRollGame3
{

    public static void main(String[] args)
    {

        // roll 5 dice
        Dice3 myDice = new Dice3();
        int[] rolls;
        rolls = myDice.rollDice();

        myDice.determineWinner(rolls);
    }
}
