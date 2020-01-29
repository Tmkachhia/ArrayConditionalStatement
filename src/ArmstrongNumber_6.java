import java.util.Scanner;

public class ArmstrongNumber_6
{
    public static void main(String[] args)
    {   int  remainder,tempnumber ,result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any three digit number : "); //user enter 3 digit number
        int originalnumber = scanner.nextInt();

       int  size = String.valueOf(originalnumber).length();//checking length of entered number
        if (size != 3)
        {
            System.out.println("Entered number is not 3 digit please check "); //if entered number is not 3 digit
        }
        else            //if number is 3 digit then check following
            { tempnumber = originalnumber;   //assigning temp number to original number

           while(tempnumber != 0)           //calculating until this condition satisfies
           {
               remainder = tempnumber%10;
               result +=(remainder*remainder*remainder);
               tempnumber = tempnumber/10;
           }
            if(result==originalnumber) //if both number match then armstrong number
            {
                System.out.println(originalnumber +" is an Armstrong number");
            }
            else
                {
                    System.out.println(originalnumber +" is not an Armstrong number");
                }
            }

        }

    }

