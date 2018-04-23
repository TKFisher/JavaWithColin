package HeadFirstJava.Chapter_3;


public class Triangle
{

    double area;
    int height;
    int length;

    public static void main(String[] args)
    {

        Triangle[] ta = new Triangle[4];

        ta[0] = new Triangle();
        ta[1] = new Triangle();
        ta[2] = new Triangle();
        ta[3] = new Triangle();

        int x = 0;


        while (x < 4) {

            ta[x].setArea();

            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;

            //

            System.out.print("triangle " + x + ", area");
            System.out.println(" = " +  ta[x].area);

            x = x + 1;
        }

    }

    void setArea()
    {
        area = (height * length) / 2;
    }
}
