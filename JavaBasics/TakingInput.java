package JavaBasics;
// AREA OF CIRCLE
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double r,pi,area;
        pi = 3.1415;
        System.out.println("Enter Radius ");
        r = sc.nextDouble();
        area = pi*r*r;
        System.out.println("Area of Circle is "+area);
    }
}
