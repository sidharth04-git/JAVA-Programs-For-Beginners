package Array;
import java.util.Scanner;
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array ");
        for(int i=0; i<=n-1; i++)
        {
            arr[i] = sc.nextInt();
        }
        // Finding Maximum and Minimum Elements
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=n-1; i++)
        {
            if(arr[i]>max)
                    max = arr[i];
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);

    }
}
