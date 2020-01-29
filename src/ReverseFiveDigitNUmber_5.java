import java.util.Scanner;

public class ReverseFiveDigitNUmber_5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any five digit number : ");//user enter 5 digit number suppose 12345
        int number = scanner.nextInt();
        int size = String.valueOf(number).length();

        if (size != 5)
        {
            System.out.println("Entered number is not 5 digit please check ");     //if not 5 digit
        } else
        {
        int length = Integer.toString(number).length();  //checking length of number
        int array[] = new int[length];              //declare array
            for (int i= 0;i<length;i++)
            {
                array[i] =number%10;        //this two calculation will reverse 5 digit number
                number=number/10;
                System.out.print(array[i] + "");
            }


        }
    }
}