package LOOPsInJava;
import java.util.Scanner;
public class PrintNto1UsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number ");
        int n = sc.nextInt();
        for(int i=n; i>0; i--)
        {
            System.out.println(i);
        }
    }
}
