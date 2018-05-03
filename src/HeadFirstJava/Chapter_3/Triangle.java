package HeadFirstJava.Chapter_3;


public class Triangle
{

    double area;
    int height;
    int length;

    public static void main(String[] args)
    {
        // Creates an object array called Triangle and assigns with 4 index positions in the array.
        Triangle[] ta = new Triangle[4];

        // variable 'x' initialized to zero.
        int x = 0;

        while (x < 4) {

            // Creates 3 new Triangle objects. For each pass of the loop variables are assigned to 'ta[x]'.
            // The values for area, height, and length will be stored in each object in the index positions: 0, 1, 2, 3 of the array.
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;

            // The method setArea is applied using the values stored in 'ta[x]'
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);

            // incrementer to allow for looping
            x = x + 1;
        }

        // takes the value in 'x' and assignes it to 'y'
        int y = x;
        x = 27;

        // Creates a local variable of the Triangle Class and assigns the values held in the last array of the loop,
        // index position 2 of the 'ta' array to the variable 't5'. 't5' will contain all 3 variables.
        Triangle t5 = ta[2];

        // The single value of '343' is assigned to the 'area' variable in the 2 array.
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);

    }

    // Method to calculate area.
    public void setArea()
    {
        area = (length / 2) * height;
    }
}
