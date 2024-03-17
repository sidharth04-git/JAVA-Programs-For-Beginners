package Conditionals;
import java.util.Scanner;

public class NestedGreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c = sc.nextInt();
        // NESTED IF_ELSE CONDITION
        if(a>b)
        {
            if(a>c)
                System.out.println(a+" is Greatest");
            else
                System.out.println(c+" is Greatest");
        }
        else // (b>a)
        {
            if(b>c)
            {
                System.out.println(b+ " is Greatest");
            }
            else  // (b<c)
            {
                System.out.println(c+" is Greatest");
            }
        }
    }
}
