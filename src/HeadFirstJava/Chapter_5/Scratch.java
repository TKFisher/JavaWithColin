package HeadFirstJava.Chapter_5;


public class Scratch
{

    public static void main(String[] args)
    {

        // Page 223
        for (int x = 0; x < 4; x++) {
            for (int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
            }

            if (x == 1) {
                x++;
            }
        }


        // Page 118
/*        int y = 7;
        for (int x = 1; x < 8; x++) {

            y++;

            if (x > 4) {
                System.out.println(++y + " ");
            }
            if (y > 14) {
                System.out.println("x = " + x);
                break;
            }
        }*/
    }
}
