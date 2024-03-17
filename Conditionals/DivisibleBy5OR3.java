package Conditionals;
import java.util.Scanner;
public class DivisibleBy5OR3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0)
            System.out.println("The Number is Divisible by either 5 or 3");
        else
            System.out.println("The Number is not Divisible by either 5 or 3");
    }
}
