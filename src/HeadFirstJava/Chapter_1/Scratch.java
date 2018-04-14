package HeadFirstJava.Chapter_1;


public class Scratch

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

    // A WHILE loop runs everything within its block (defined by curly braces)
    // as long as the conditional test is true.
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


}
