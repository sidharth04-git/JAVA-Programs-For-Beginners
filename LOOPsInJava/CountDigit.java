package LOOPsInJava;
import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int count = 0;
        int a = n;
        while(n>0)
        {
            n = n/10;
            count++;
        }
        if(a==0)
            System.out.println(1+" Digit Number");
        else
            System.out.println(count+" Digit Number");
    }
}
