package JavaBasics;
import java.util.Scanner;
public class Find_Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Divident a : ");  // Divident
        int a = sc.nextInt();
        System.out.print("Enter Divisor b : ");  // Divisor
        int b = sc.nextInt();
        int q = a/b; // Quotient
        int r;
        // Divisor * Quotient + Remainder = Divident
        // b * q + r = a
        // r = a - (b * q)
        r = a - (b*q);
        System.out.println("The Remainder is "+r);

    }
}
