import java.util.Scanner;

public class OccurrenceOfCharacter_a_9
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any String : ");        //user enter ant string
        String sentence = scanner.nextLine();
        System.out.println(sentence);                   //printing sentence
        int count = 0;
            for(int i =0 ;i < sentence.length(); i++)
        {
            if(sentence.charAt(i) == 'a')       //checking value of array ia 'a' by inbuilt method
            {
                count++;                        // if 'a' then increase by 1
            }
        }
        System.out.println("occurrence of a  is : " +count + " time");
     }
}
