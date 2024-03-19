package NumberSystem;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Number");
        int binary_num = sc.nextInt();
        int ans = 0;  // Store the Answer
        int pw = 1;  // 2^0 --> 0
        while(binary_num>0)
        {
            int unit_digit = binary_num%10; // Last Digit nikal kr dega
            ans +=(unit_digit*pw);
            binary_num/=10; // Remove the last digit
            pw*=2;
        }
        System.out.println(ans);
    }
}

