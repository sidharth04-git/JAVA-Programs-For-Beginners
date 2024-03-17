package Conditionals;
import java.util.Scanner;
public class YoungestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age of Sidharth");
        int s = sc.nextInt();
        System.out.println("Enter Age of Aditya");
        int a = sc.nextInt();
        System.out.println("Enter Age of Beelawdapul");
        int b = sc.nextInt();
        if(s<a && s<b)  // s chhota hai
            System.out.println("Sidharth is Youngest");
        else if(a<s && a<b)  // a chhota hai
            System.out.println("Aditya is Youngest");
        else  // b chhota hai
            System.out.println("Beelawdapul is Youngest");
    }
}
