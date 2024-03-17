package Conditionals;
import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("Enter Year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // Condition
        if(year%400==0)
            System.out.println("The Year is a Leap Year");
        else if (year%100==0)
            System.out.println("The Year is Not a Leap Year");
        else if (year%4==0)
            System.out.println("The Year is a Leap Year");
        else
            System.out.println("The Year is not a Leap Year");
    }
}
