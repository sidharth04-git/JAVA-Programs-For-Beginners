package Conditionals;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        // Condition
        if(n<0)
        {
            n = n * (-1);
        }
        System.out.println("The Absolute Value is " +n);
    }
}
