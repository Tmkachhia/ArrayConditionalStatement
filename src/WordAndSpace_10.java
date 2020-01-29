import java.util.Scanner;

public class WordAndSpace_10
{
    public static void main(String[] args)
    {
        int space = 0;
        int countWord = 1 ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string : ");      //user enter string using scanner
        String sentence = scanner.nextLine();

        for(int i = 0 ; i <sentence.length() ; i++)
        {
            if(sentence.charAt(i) ==' ')            //checking if array contain space then increase space
            {
                space++;                    //increase space
                countWord++;                //increase count word
            }

        }
        System.out.println("Number of spaces  : " + space);
        System.out.println("Number of words : "+ countWord);

        {

        }

    }
}

