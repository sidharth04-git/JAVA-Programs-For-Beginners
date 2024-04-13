package Array;
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+ n + " Elements in the Array");
        for(int i=0; i<n; i++)
        {
             arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
