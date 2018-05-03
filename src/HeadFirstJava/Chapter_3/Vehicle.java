package HeadFirstJava.Chapter_3;

public class Vehicle
{

    int numOfWheels = 4;
    double fuelTankCapicity = 30;
    int maxSpeed = 100;
    double numOfGallonsGasTank = 0;
    String  modelName = "Toyota";
    String color = "blue";
    int numOfSeats = 6;
    String modelSubClass = "Corolla";
    String navigationGPS = "heading south";

    public static void main(String[] args)
    {
        Vehicle myCar = new Vehicle();
         System.out.println("The color of my " + myCar.modelName + " "
                 + myCar.modelSubClass + " is "
                 + myCar.color + " and it has "
                 + myCar.numOfWheels + " wheels and "
                 + myCar.numOfSeats + " seats."
         );
    }
}