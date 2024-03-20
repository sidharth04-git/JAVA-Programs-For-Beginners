package LOOPsInJava;
import java.util.Scanner;
public class PrimeNumberOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a Numeber");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i=2; i<=n-1; i++)
        {
            if(n%i==0)
            {
                flag = false;
                break;

            }
        }
        if(n==1)
            System.out.println("Neither Prime Nor Composite");
        else if(flag==true)
            System.out.println("Prime Number");
        else
            System.out.println("Composite Number");
    }
}
