package HeadFirstJava.Chapter_5;

public class SimpleDotCom
{

    int[] locationCells;
    int numOfHits = 0;


    public void setLocationCells(int[] locations)
    {
        locationCells = locations;
    }

    public String checkYourself(String usersGuess)
    {
        // note: A: Integer.parseInt() works only on Strings that represent the ascii values for digits (0,1,2,3,4,5,6,7,8,9).
        int guess = Integer.parseInt(usersGuess);

        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                System.out.println("You got a hit.");
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
            if (numOfHits == 3) {
                System.out.println("You sunk my battleship!");
            }
        }
        System.out.println(result);
        return result;
    }

    public static int getRandomNumber(double min,double max)
    {

        int x = (int) (Math.random() * ((max - min)) + min);
        return x;
    }

}
