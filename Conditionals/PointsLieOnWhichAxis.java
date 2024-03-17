package Conditionals;
import java.util.Scanner;
public class PointsLieOnWhichAxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Points x and y ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x==0 && y==0)
            System.out.println("The Points Lie on Origin");
        else if(x==0)
            System.out.println("The Points Lie on y - axis ");
        else if(y==0)
            System.out.println("The Points Lie on x - axis ");
        else
            System.out.println("The Points does not lie on x and y axis ");
    }
}
