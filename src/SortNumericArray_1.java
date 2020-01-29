import java.util.Scanner;

public class SortNumericArray_1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of elements  you want to sort : ");
        int numberOfElement = scanner.nextInt();  //user input the array size(how many number to sort) suppose 3

        System.out.println("Enter all that elements : "); //user enter that numbers which he/she wanted to sort
        int numberToSort[] = new int[numberOfElement]; // suppose 4 ,8 ,3  declaration of array

        for (int i = 0; i < numberOfElement; i++)
        {    //index i is less than array size 3 numberToSort[0]=4 ,numberToSort[1]=8 numberToSort[2]=3
            numberToSort[i] = scanner.nextInt(); //assigning value to array
        }
        for (int i = 0; i < numberOfElement; i++) //I used a = numberTo sort
        { //when a[0] check with a[1] and a[2]
            for (int j = i + 1; j < numberOfElement; j++)
            { //checking a[0] > a[1] then switch the number
                if (numberToSort[i] > numberToSort[j])
                { // 4 < 8 no switching   4, 8 ,3
                    numberToSort[i] = numberToSort[i] + numberToSort[j];   // 4 >3 so switch so now we have 3 8 4
                    numberToSort[j] = numberToSort[i] - numberToSort[j];
                    numberToSort[i] = numberToSort[i] - numberToSort[j];  //a[1] =8 >a[2]=4 so switch so 3,4,8
                }
            }
        }
                     System.out.print("ascending Order : ");
                    for (int i = 0; i < numberOfElement - 1; i++)
                    {
                        System.out.print(numberToSort[i] + ","); //printing a[0] and a[1] as i < array size
                    }
                        System.out.print(numberToSort[numberOfElement - 1]);  //then print  a[2]
    }
}
