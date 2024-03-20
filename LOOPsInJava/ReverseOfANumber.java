package LOOPsInJava;
import java.util.Scanner;
public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int original_number = n;
        int reverse = 0;
        int last_digit;
        while (n>0)
        {
            reverse*=10;
            last_digit = n%10;
            reverse+=last_digit;
            n/=10;
        }
        System.out.println("The Revserse of the Number "+"original_number is "+reverse);
    }
}
