package JavaBasics;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number ");
        int b = sc.nextInt();
        System.out.println("The Remainder is "+a%b);  // a%b gives remainder
    }
}
