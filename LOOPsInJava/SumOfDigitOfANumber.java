package LOOPsInJava;
import java.util.Scanner;
public class SumOfDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int last_digit = 0;
        int sum = 0;
        while(n>0)
        {
            last_digit = n%10;
            sum+=last_digit;
            n/=10;
        }
        System.out.println("Sum of Digit is " +sum);
    }

}
