package Conditionals;
import java.util.Scanner;
public class ThreeDigitNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // INPUT KE LIYE MUST HAI
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if(n>99 && n<1000)
            System.out.println("The Given Number is Three Digit");
        else
            System.out.println("The Given Number is not Three Digit");
    }
}
