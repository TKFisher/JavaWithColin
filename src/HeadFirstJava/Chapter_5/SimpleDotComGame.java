package HeadFirstJava.Chapter_5;

public class SimpleDotComGame
{

    public static void main(String[] args)
    {

        SimpleDotCom myDot = new SimpleDotCom();

        int[] locations = {2,3,4};

        myDot.setLocationCells(locations);


/*        String userGuess = "4";
        String result = myDot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);*/


        String [] userGuesses = {"1","3","4"};
        for (int i = 0; i < userGuesses.length; i++){
            String result = myDot.checkYourself(userGuesses[i]);
            String testResult = "failed";
            if (result.equals("hit")) {
                testResult = "passed";
            }
            System.out.println(testResult);
        }

        //myDot.getRandomNumber(1, 4);


    }
}
