package Conditionals;
import java.util.Scanner;
public class DivisibleByFiveOrThreeButNotFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0)
        {
            if(n%15!=0)
                System.out.println("The Number is Divisible by 5 or 3 But Not 15");
            else
                System.out.println("Not Matching Required Condition");

        }
        else
        {
            System.out.println("Not Matching Required Condition");
        }


    }
}
