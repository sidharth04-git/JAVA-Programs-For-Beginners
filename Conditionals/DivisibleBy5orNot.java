package Conditionals;
import java.util.Scanner;
public class DivisibleBy5orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number n : ");
        int n = sc.nextInt();
        // Condition
        if(n%5==0)
        {
            System.out.println("The Number "+n+ " is Divisible By 5");
        }
        else // n is not divisible by 5 i.e --> n%5!=0
        {
            System.out.println("The Number "+n+ " is not Divisible By 5");
        }
    }
}
