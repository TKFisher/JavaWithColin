package HeadFirstJava.Chapter_4;

public class XCopy
{

    // Test within main:
    public static void main(String [] args) {

        int orig = 42;

        XCopy x = new XCopy();

        int y = x.go(orig);

        System.out.println(orig + " " + y);
    }



    int go(int arg) {

        arg = arg * 2;

        return arg;
    }
}
