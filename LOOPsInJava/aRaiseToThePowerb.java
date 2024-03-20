package LOOPsInJava;
import java.util.Scanner;
public class aRaiseToThePowerb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base a ");
        int a = sc.nextInt();
        System.out.println("Enter power b");
        int b = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=b; i++)
        {
            fact*=a;
        }
        System.out.println(fact);
    }
}
