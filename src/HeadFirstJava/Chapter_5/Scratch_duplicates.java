package HeadFirstJava.Chapter_5;

public class Scratch_duplicates
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,6,7,6,5,9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if(arr[i]==arr[j]){
                    System.out.println("duplicates: " + arr[j]);
                }
            }
        }
    }
}
