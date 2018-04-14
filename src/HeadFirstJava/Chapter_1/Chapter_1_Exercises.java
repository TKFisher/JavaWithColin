package HeadFirstJava.Chapter_1;

public class Chapter_1_Exercises
{

    public static void main(String[] args)
    {
        //exercise2a();

        ninetyNineBottlesOfBeer(true);

        PoolPuzzleOne();
        //PoolPuzzleBookExample();


    }


    /* Challenge 1:  99 bottles of beer on the wall
    We need a class with a main(), an int and a String variable, a while loop, and an if test. */
    public static void ninetyNineBottlesOfBeer(boolean beerBottles)
    {
        int bottleNum = 99;

        if (beerBottles) {

            while (bottleNum > 0) {
                System.out.print(bottleNum + " bottles of beer on the wall, " + bottleNum + " bottles of beer.\n" +
                        "Take one down and pass it around, ");

                bottleNum = bottleNum - 1;


                if (bottleNum > 1) {
                    System.out.println(bottleNum + " bottles of beer on the wall.\n");


                } else if (bottleNum == 1) {
                    System.out.println(bottleNum + " bottle of beer on the wall.\n");

                } else if (bottleNum == 0) {

                    System.out.println("...no more bottles of beer on the wall, no more bottles of beer. \n" +
                            "Go to the store and buy some more, 99 bottles of beer on the wall. ");
                }
            }
        }
        System.out.println("No beer here! ");
    }

    public static void PoolPuzzleOne()
    {
        int x = 0;

        while (x < 4) {

            System.out.print("a");

            if (x < 1) {
                System.out.print(" ");
                System.out.print("noise");

            }
            if (x > 0) {
                System.out.print("n");

            }
            if (x == 1) {
                System.out.print("noys");

            }
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;

            }
            System.out.println();
            x = x + 1;
        }
    }

    public static void PoolPuzzleBookExample()
    {

        int x = 0;

        while (x < 4) {

            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");

            if (x > 1) {

                System.out.print(" oyster");
                x = x + 2;
            }
            if (x == 1) {

                System.out.print("noys");
            }
            if (x < 1) {

                System.out.print("oise");
            }
            System.out.println("");

            x = x + 1;
        }
    }

    // yes - will compile and run
    public static void exercise2a()
    {
        int x = 3;

        while (x > 0) {

            if (x == 2) {
                System.out.print("b c");
                x = x - 1;
            }

            if (x > 2) {
                System.out.print("a");
                x = x - 1;

            }
            System.out.print("-");

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }


    }

    // no - won't compile because it is was missing the class
    public static void exercise2b()
    {

        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }

    // yes but it won't do anything because it is missing the main class.
    public static void exercise2c()
    {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }

    public static void mixedMessages()
    {


    }


}


