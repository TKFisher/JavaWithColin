package scratch;


public class Chapter_1

{

    public static void xLoop_1()
    {
        int x = 1;
        while (x > 12) {
            x = x - 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void ifElse_1(int x, String name)
    {
        if (x == 10) {
            System.out.println("x must be 10");
        } else  {
            System.out.println("x isn't 10");
        }
        if ((x < 3) && (name.equals("Dirk"))) {
            System.out.println("Gently");
        }
        System.out.println("this line runs no matter what");
    }

    // A WHILE loop runs everything within its block (defined by curly braces) as long as the conditional test is true.
    // Put a boolean test inside parentheses
    public static void while_1()
    {
        int x = 1;
        while (x == 1) {
            System.out.println(x);
        }
    }

    public static void isHot()
    {
        boolean isHot = true;
        while (isHot) {
            System.out.println("hi");
        }
    }

    // IF
    public static void ifTest()
    {

        int x = 3;
        if (x == 3) {

            System.out.println("X = " + x);
        } else {
            System.out.println("X = " + x);
        }
        System.out.println("this line always prints.");
    }

    public static void fillInChallenge()
    {
        int x = 1;
        while (x < 5) {
            System.out.println("Doo");
            System.out.println("Bee");
            x = x + 1;
        }
        if (x == 1) {
            System.out.print("Do");
        }
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


}
