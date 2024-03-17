package Conditionals;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int x = sc.nextInt();
        if(x%2==0)
            System.out.println("The Number is Even");
        else
            System.out.println("The Number is Odd");
    }

}
