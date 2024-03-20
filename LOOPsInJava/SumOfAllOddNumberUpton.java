package LOOPsInJava;
import java.util.Scanner;
public class SumOfAllOddNumberUpton {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSum = 0;
        for(int i=1; i<=n; i++)
        {
            if(i%2!=0)
            {
                oddSum+=i;
            }
        }
        System.out.println(oddSum);
    }
}
