package Array;
import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size ");
        int n = sc.nextInt();
        int a[] = new int[n];  // array define
        // Input
        for(int i=0; i<=n-1; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Target Element");
        int target = sc.nextInt();

        for(int i=0; i<=n-1; i++)
        {
            if(a[i]==target)
            {
                System.out.println("Index is " + i);
                break;
            }
        }

    }
}
