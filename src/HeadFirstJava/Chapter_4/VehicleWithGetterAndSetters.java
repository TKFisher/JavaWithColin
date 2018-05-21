package HeadFirstJava.Chapter_4;


/*
 * Take those variables and create getter and setter methods for each variable.
 * Then print out the value using methods
 * Example: setNumOfSeats = 4;
 * System.out.println(“v.getNumOfSeats, + “ “ + …..)
 *
 */

public class VehicleWithGetterAndSetters
{

    int numOfWheels = 4;
    double fuelTankCapicity = 30;
    int maxSpeed = 100;
    double numOfGallonsGasTank = 0;
    String modelName = "Toyota";
    String color = "blue";
    int numOfSeats = 6;
    String modelSubClass = "Corolla";
    String navigationGPS = "heading south";

    public static void main(String[] args)
    {
        //
        VehicleWithGetterAndSetters myCar = new VehicleWithGetterAndSetters();

        // From Chapter 3
        System.out.println("The color of my " + myCar.modelName + " "
                + myCar.modelSubClass + " is "
                + myCar.color + " and it has "
                + myCar.numOfWheels + " wheels and "
                + myCar.numOfSeats + " seats.");

        // Refactored in Chapter 4 with Setters and Getters
        myCar.setModelName("Jeep");
        myCar.setModelSubClass("Grand Cherokee");
        myCar.setColor("dark blue");
        System.out.println("I have a " + myCar.getModelName() + " " + myCar.getModelSubClass() +
                " and it's " + myCar.getColor() + ".");
    }


    // Setters List

    public void setNumOfWheels(int numOfWheels)
    {
        this.numOfWheels = numOfWheels;
    }

    public void setFuelTankCapicity(double fuelTankCapicity)
    {
        this.fuelTankCapicity = fuelTankCapicity;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public void setNumOfGallonsGasTank(double numOfGallonsGasTank)
    {
        this.numOfGallonsGasTank = numOfGallonsGasTank;
    }

    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setNumOfSeats(int numOfSeats)
    {
        this.numOfSeats = numOfSeats;
    }

    public void setModelSubClass(String modelSubClass)
    {
        this.modelSubClass = modelSubClass;
    }

    public void setNavigationGPS(String navigationGPS)
    {
        this.navigationGPS = navigationGPS;
    }


    // Getters List

    public int getNumOfWheels()
    {
        return numOfWheels;
    }

    public double getFuelTankCapicity()
    {
        return fuelTankCapicity;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public double getNumOfGallonsGasTank()
    {
        return numOfGallonsGasTank;
    }

    public String getModelName()
    {
        return modelName;
    }

    public String getColor()
    {
        return color;
    }

    public int getNumOfSeats()
    {
        return numOfSeats;
    }


    public String getModelSubClass()
    {
        return modelSubClass;
    }

    public String getNavigationGPS()
    {
        return navigationGPS;
    }


}