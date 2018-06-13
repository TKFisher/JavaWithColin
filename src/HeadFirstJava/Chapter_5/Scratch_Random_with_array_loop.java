package HeadFirstJava.Chapter_5;



public class Scratch_Random_with_array_loop
{

    public static void main(String[] args)
    {
        rollDice();
    }

    public static void rollDice()
    {

        // method 1 when you know the values of the array:
        int[] myNumbers = {1, 2, 3, 4, 5 };

        // method 2
        // the 'new' means, create a place in memory for a new array to hold 5 elements.
        int[] randomNumbers = new int[5];

        // loop through the 5 elements and create a random number.
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 6 + 1);
        }
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }
    }
}
