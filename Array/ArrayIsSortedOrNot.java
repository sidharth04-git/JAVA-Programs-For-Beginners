package Array;
import java.util.Scanner;
public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size ");
        int n = sc.nextInt();
        int arr[] = new int[n];  // Array Declration
        System.out.println("Enter Array Elements ");
        for(int i=0; i<=n-1; i++)
        {
            arr[i] = sc.nextInt();
        }
        // Now Checking Array is Sorted Or Not
        boolean isSorted = true;
        for(int i=0; i<=n-2; i++)
        {
            if(arr[i]>arr[i+1])
                isSorted = false;
        }
        if(isSorted)
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is Not Sorted");
    }
}
