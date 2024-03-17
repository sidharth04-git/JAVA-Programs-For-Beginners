package Conditionals;
import java.util.Scanner;
public class NestedDivisibleBy5And3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if (n % 5 == 0)
        {
            if(n%3==0)
                System.out.println("The Number is Divisible by Both 5 and 3");
            else
                System.out.println("The Number is Divisible by 5 but not 3");
        }
        else
        {
            System.out.println("The Number is not Divisible by 5 and 3");
        }
    }
}
