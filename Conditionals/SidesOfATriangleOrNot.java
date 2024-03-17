package Conditionals;
import java.util.Scanner;
public class SidesOfATriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Side");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Side");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Side");
        int c = sc.nextInt();

        if((a+b)>c && (b+c)>a && (c+a)>b)
            System.out.println("VALID TRIANGLE");
        else
            System.out.println("INVALID TRIANGLE");
    }
}
