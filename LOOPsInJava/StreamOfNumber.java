package LOOPsInJava;
import java.util.Scanner;
public class StreamOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=-1)
        {
            sum+=n;
            n = sc.nextInt(); // User se dubara Input Liya
        }
        System.out.println(sum);
    }
}
