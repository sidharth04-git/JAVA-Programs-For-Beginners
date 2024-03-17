package Conditionals;
import java.util.Scanner;
public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c = sc.nextInt();
        // CONDITION
        if(a>b && a>c)
            System.out.println(a+ " is Greatest");
        else if(b>a && b>c)
            System.out.println(b+" is Greatest");
        else  // (c>a && c>b)
            System.out.println(c+ " is Greatest");
    }
}
