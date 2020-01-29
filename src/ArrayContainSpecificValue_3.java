import java.util.Scanner;

public class ArrayContainSpecificValue_3 {
    public static void main(String[] args) {

        int  i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements : "); //user input how many number to enter
        int  number= scanner.nextInt();

        int array []= new int[number];                           // creating array to store number
        System.out.println("Enter " + number + " integers");

        for (i = 0; i < number; i++)
            array[i] = scanner.nextInt();         //Loop to store each numbers in array - assigning value

        System.out.print("Enter the search value : ");
        int searchValue= scanner.nextInt();  //user enter value to be searched

        for ( i= 0; i< number; i++) {
            if (array[i] == searchValue)
            {
                System.out.println(searchValue + " is present at location " + (i + 1));
               break;
            }
        }
        if (i == number)
            System.out.println(searchValue + " doesn't exist in array.");
    }
}
