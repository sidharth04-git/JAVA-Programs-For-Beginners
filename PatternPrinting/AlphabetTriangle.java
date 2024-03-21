package PatternPrinting;
import java.util.Scanner;
public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                char ascii = (char)(j+64);  // TypeCasting Int to Character
                System.out.print(ascii);
            }
            System.out.println();
        }
    }
}
