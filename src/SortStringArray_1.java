import java.sql.SQLOutput;
import java.util.Scanner;

public class SortStringArray_1
{
        public static void main(String[] args)
        {
             String temp ;
             Scanner scanner = new Scanner(System.in);
             System.out.print("Enter number of strings to be sorted : "); //user will enter no. how many string to sort
            int numberOfString = scanner.nextInt();
             String stringToSort [] = new String[numberOfString];// creating array to store string
             Scanner s1 = new Scanner(System.in);
             System.out.println("Enter all string : "); //user will enter all string one by one
           for (int i = 0; i < numberOfString ;i++)
           {
               stringToSort[i]= s1.next();// a[0] a[1] a[2] eg sachin ,saurav ,ratan assiging value to array
           }
            for (int i = 0 ;i < numberOfString ;i++ )//a[0]= sachin.a[1]=saurav<0 do not switch check a[0].compareTo a[2]
            {                                      // we have sachin ,saurav ,ratan
                for (int j = i+1 ; j < numberOfString; j++) // sachin.compareTo ratan s>r so switch
                {                                       // now we have ratan ,saurav ,sachin
                    if(stringToSort[i].compareTo(stringToSort[j])>0)//comparing string
                    {
                        temp = stringToSort[i];                 //now i= 1,  a[1].compareTo a[2]>0 so switch then
                        stringToSort[i] = stringToSort[j];      //now we have ratan,sachin,saurav
                        stringToSort[j]= temp;
                    }
                }
            }

            System.out.println("sorted string is : ");
            for (int i =0 ; i< numberOfString-1 ;i++)
            {
                System.out.print(stringToSort[i]  + " , ");//printing first two name in our case
            }
            System.out.println(stringToSort[numberOfString-1]);  //and printing last one

    }
}
