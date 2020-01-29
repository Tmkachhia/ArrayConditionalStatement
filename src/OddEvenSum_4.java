import java.util.Scanner;

public class  OddEvenSum_4
{
    public static void main(String[] args)
    {
        int evenCount = 0;
        int oddCount = 0;
        int evenSum = 0;
        int oddSum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any five digit number : ");//user enter 5 digit number suppose
        int number = scanner.nextInt();
        int size = String.valueOf(number).length();     //counting length os integer
        if(size != 5)
        {
            System.out.println("Entered number is not 5 digit please check"); //if number is not 5 digit number
        } else {
            String number2 = String.valueOf(number);
            int numberArray[] = new int[number2.length()];//creating array

            for (int i = 0; i < number2.length(); i++) {
                numberArray[i] = Character.digit(number2.charAt(i), 10);//assigning particular digit to array
                if (numberArray[i] % 2 == 0) {
                    evenCount++;                    //if array is divisible by 2 then increase evencount
                    evenSum = evenSum + numberArray[i]; //evensum +evencount gives even number sum
                } else {
                    oddCount++;                     //not divisible by 2 then digit /array is odd digit
                    oddSum = oddSum + numberArray[i];  //oddsum+oddcount gives addition of odd digit
                }
            }

            System.out.println("even count : " + evenCount);
            System.out.println("even sum : " + evenSum);
            System.out.println("odd count : " + oddCount);
            System.out.println("odd sum : " + oddSum);
        }
    }
}
