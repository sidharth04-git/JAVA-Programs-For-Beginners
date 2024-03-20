package LOOPsInJava;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int a = 1 , b = 1 , sum = 0;
        for(int i=1; i<=n; i++)
        {
            System.out.print(a+" ");
            sum = a+b;
            a = b;
            b = sum;
        }
    }
}
