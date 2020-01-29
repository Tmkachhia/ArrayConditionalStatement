import java.util.Scanner;

public class SumOfArrayValue_2
{
    public static void main(String[] args)
    {     int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many arrays value you want to sum : "); //user enter how many number to sum
        int totalArray = scanner.nextInt();

        System.out.println("Enter all values : ");//entering all values
        int arrayToSum [] = new int [totalArray]; //declaration of array

        for (int i =0 ;i<totalArray;i++)
        {
            arrayToSum[i]=scanner.nextInt(); //assigning value to a[i]
            sum = sum + arrayToSum[i];      //sum of values of array
        }
        System.out.println("Sum of values of an arrays is : " + sum);
    }
}
