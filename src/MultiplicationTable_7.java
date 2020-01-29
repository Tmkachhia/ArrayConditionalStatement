import java.util.Scanner;

public class MultiplicationTable_7
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter which time table you want to print : "); //user enter which time table to be calculated
        int table = scanner.nextInt();
        System.out.print("enter the number start from :"); // where to start that multiplication table
        int startWith = scanner.nextInt();
        System.out.print("enter number you want to stop with : ");//until what number multiplication table to be calculated
        int endWith = scanner.nextInt();
        int i = table;
        int j = startWith;
        int k = endWith;
     do
         {
             System.out.println(i + " X " + j +"  = " + i*j); //printing table
            j++;
         }while (j<=k); //condition until which number to print
    }
}
