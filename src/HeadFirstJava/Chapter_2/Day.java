package HeadFirstJava.Chapter_2;

public class Day
{
    public void determineSuffix(int dayNum)
    {
        // Create method using if & else conditionals to
        // determine what each day’s suffix is (ie. 1st, 7th)

        if (dayNum == 1) {
            System.out.println("It's Monday, the 1st day of the week");
        } else if (dayNum == 2) {
            System.out.println("It's Tuesday, the 2nd day of the week");
        } else if (dayNum == 3) {
            System.out.println("It's Wednesday, the 3rd day of the week");
        } else if (dayNum == 4) {
            System.out.println("It's Thursday, the 4th day of the week");
        } else if (dayNum == 5) {
            System.out.println("It's Friday, the 5th day of the week");
        } else if (dayNum == 6) {
            System.out.println("It's Saturday, the 6th day of the week");
        } else if (dayNum == 7) {
            System.out.println("It's Sunday, the 7th day of the week");
        }
    }

    public void determineSiffixTwo(int numDay)
    {
        String[] day = new String[7];

        day[1] = "Monday";
        day[2] = "Tuesday";
        day[3] = "Wednesday";
        day[4] = "Thursday";
        day[5] = "Friday";
        day[6] = "Saturday";
        day[7] = "Sunday";

        // TODO: finish this

    }

}
