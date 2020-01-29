import java.util.Scanner;

public class FibonacciSeries_8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms of Fibonacci series : "); //user enter number till
        int number = scanner.nextInt();

        int series [] = new int[number]; //declaration of array
        series[0] = 1 ;                     // first array value is assigned
        series[1] = 1;                        // value of second array is assigned
        for (int i = 2 ; i< number ; i++)
        {
            series[i] = series[i-1]+series[i-2];   //assigning value of array(not first two) by adding two previous array
        }
        for (int j = 0 ; j< number ; j++)
        {
            System.out.print(series[j] + " "); //printing values
        }
    }
}
