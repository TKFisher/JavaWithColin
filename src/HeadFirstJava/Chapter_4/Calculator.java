package HeadFirstJava.Chapter_4;


/*
 * Build a calculator class
 * Create 4 methods (add, subtract, divide, multiply)
 * Return value for each method is int
 * Each method must have two parameters
 * Printout the results of the following:
 * Add two numbers to = 12
 * Subtract two numbers to = 8
 * Multiply two numbers to = 20
 * Divide two numbers to = 5
 */

public class Calculator
{

    private double result = 0;

    public static void main(String[] args)
    {
        Calculator myCalc = new Calculator();
        myCalc.add(6, 6);
        myCalc.subtract(9, 1);
        myCalc.multiply(2, 10);
        myCalc.divide(50, 10);
        
    }


    public double add(double firstValue, double secondValue)
    {
        result = firstValue + secondValue;

        System.out.println(firstValue + " + " + secondValue + " = " + result);
        return result;
    }


    public double subtract(double firstValue, double secondValue)
    {
        result = firstValue - secondValue;

        System.out.println(firstValue + " - " + secondValue + " = " + result);
        return result;
    }


    public double divide(double firstValue, double secondValue)
    {

        result = firstValue / secondValue;

        System.out.println(firstValue + " / " + secondValue + " = " + result);
        return result;
    }


    public double multiply(double firstValue, double secondValue)
    {
        result = firstValue * secondValue;

        System.out.println(firstValue + " * " + secondValue + " = " + result);
        return result;
    }


}
