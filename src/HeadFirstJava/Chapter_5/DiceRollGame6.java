package HeadFirstJava.Chapter_5;


public class DiceRollGame6
{

    public static void main(String[] args)
    {

        // roll 5 dice
        Dice6 myDice = new Dice6();
//        int[] rolls;
//        rolls = myDice.rollDice();

        // Tester:
         int[] rolls = {2, 2, 2, 2, 3};
         myDice.determineWinner(rolls);
    }
}
