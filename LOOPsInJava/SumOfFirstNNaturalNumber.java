package LOOPsInJava;
import java.util.Scanner;
public class SumOfFirstNNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int num = 1;
        int sum = 0;
        while(num<=n)
        {
            sum+=num;
            num++;
        }
        System.out.println(sum);

    }

}
