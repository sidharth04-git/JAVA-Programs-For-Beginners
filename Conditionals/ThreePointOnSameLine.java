package Conditionals;
import java.util.Scanner;
public class ThreePointOnSameLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 and y1");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter x2 and y2");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Enter x3 and y3");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double m1,m2;
        m1 = (y2-y1)/(x2-x1);
        m2 = (y3-y2)/(x3-x2);
        if(m1==m2)
                System.out.println("The Three points lie on a Straight Line");
        else
            System.out.println("They do not lie on a Straight line");
    }
}
