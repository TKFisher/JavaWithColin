package HeadFirstJava.Chapter_5;

import java.util.Arrays;

public class Dice4
{

    public static int[] rollDice()
    {

        int[] randomNumbers = new int[5];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 6 + 1);
        }
        System.out.println("You've rolled = " + Arrays.toString(randomNumbers));
        return randomNumbers;
    }


    public void determineWinner(int[] diceRolls)
    {
        int die1 = diceRolls[0];
        int die2 = diceRolls[1];
        int die3 = diceRolls[2];
        int die4 = diceRolls[3];
        int die5 = diceRolls[4];

        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;

//        System.out.println(
//                "Roll 1 = " + die1 + "\n" +
//                        "Roll 2 = " + die2 + "\n" +
//                        "Roll 3 = " + die3 + "\n" +
//                        "Roll 4 = " + die4 + "\n" +
//                        "Roll 5 = " + die5);

//        //die1:
//        for (int i = 0; i <= diceRolls.length; i++) {
//            if (diceRolls[0] == 1 || diceRolls[1] == 1 || diceRolls[2] == 1 || diceRolls[3] == 1 || diceRolls[4] == 1 || diceRolls[5] == 1) {
//                ones++;
//            }
//        }


        // die1:
        if (die1 == 1) {
            ones++;

        }
        if (die1 == 2) {
            twos++;

        }
        if (die1 == 3) {
            threes++;

        }
        if (die1 == 4) {
            fours++;

        }
        if (die1 == 5) {
            fives++;

        }
        if (die1 == 6) {
            sixes++;

        }

        //die2:
        if (die2 == 1) {
            ones++;

        }
        if (die2 == 2) {
            twos++;

        }
        if (die2 == 3) {
            threes++;

        }
        if (die2 == 4) {
            fours++;

        }
        if (die2 == 5) {
            fives++;

        }
        if (die2 == 6) {
            sixes++;

        }

        //die3:
        if (die3 == 1) {
            ones++;

        }
        if (die3 == 2) {
            twos++;

        }
        if (die3 == 3) {
            threes++;

        }
        if (die3 == 4) {
            fours++;

        }
        if (die3 == 5) {
            fives++;
        }
        if (die3 == 6) {
            sixes++;

        }

        //die4:
        if (die4 == 1) {
            ones++;
        }
        if (die4 == 2) {
            twos++;
        }
        if (die4 == 3) {
            threes++;
        }
        if (die4 == 4) {
            fours++;
        }
        if (die4 == 5) {
            fives++;
        }
        if (die4 == 6) {
            sixes++;
        }

        //die5:
        if (die5 == 1) {
            ones++;
        }
        if (die5 == 2) {
            twos++;
        }
        if (die5 == 3) {
            threes++;
        }
        if (die5 == 4) {
            fours++;
        }
        if (die5 == 5) {
            fives++;
        }
        if (die5 == 6) {
            sixes++;
        }

        if (diceRolls[0] == diceRolls[1] && diceRolls[0] == diceRolls[2]) {
            System.out.println("Yatzee!!");
        }

        if (ones == 1 && twos == 1 && threes == 1 && fours == 1 && fives == 1) {
            System.out.println("You have a straight.");
        }

        if (twos == 1 && threes == 1 && fours == 1 && fives == 1 && sixes == 1) {
            System.out.println("You have a straight.");
        }


        if ((ones == 2 || ones == 4)
                || (twos == 2 || ones == 4)
                || (threes == 2 || threes == 4)
                || (fours == 2 || fours == 4)
                || (fives == 2 || fives == 4)
                || (sixes == 2 || sixes == 4))

        {

            System.out.println("You have at least one pair.");
        }

        if ((ones == 3 || twos == 3 || threes == 3 || fours == 3 || fives == 3 || sixes == 3)) {
            System.out.println("You have one triples.");
        }
    }
}



