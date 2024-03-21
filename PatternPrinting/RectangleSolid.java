package PatternPrinting;
import java.util.Scanner;

public class RectangleSolid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Number");
        int r = sc.nextInt();
        System.out.println("Enter Column Number");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

