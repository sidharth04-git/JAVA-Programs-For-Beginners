package Conditionals;
import java.util.Scanner;
public class AreaPerimeterGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lenght");
        int l = sc.nextInt();
        System.out.println("Enter Breadth");
        int b = sc.nextInt();
        int area = l*b;
        int perimeter = 2*(l+b);
        // CONDITION
        if(area>perimeter)
        {
            System.out.println("Area is Greater than the Perimeter");
        }
        else if(area==perimeter)
        {
            System.out.println("Area and Perimeter are Equal");
        }
        else
        {
            System.out.println("Perimeter is Greater than Area");
        }

    }
}




