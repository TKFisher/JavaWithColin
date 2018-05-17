package HeadFirstJava.Chapter_3;


public class Student
{
    String name = null;
   double examScore = 0;

    /*
     * Create a method to assign gradeLetter to examScore
     * One student gets F less than 59
     * One student gets D less than 69
     * One student gets C less than 79
     * One student gets B less than 89
     * One student gets A less than 100
     */

    public String gradeLetter(double examScore)
    {
        String letterGrade;

        if (examScore < 59) {
            letterGrade = "F";

        } else if (examScore < 69) {
            letterGrade = "D";

        } else if (examScore < 79) {
            letterGrade = "C";

        } else if (examScore < 89) {
            letterGrade = "B";

        } else {
            letterGrade = "A";

        }

        return letterGrade;
    }

}


