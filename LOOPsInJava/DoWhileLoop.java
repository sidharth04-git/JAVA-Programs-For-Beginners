package LOOPsInJava;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number Which is less than 20");
        int n = sc.nextInt();
        do{
            System.out.println(n);
        }while(n<=20);
    }
}
