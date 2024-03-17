package Conditionals;
import java.util.Scanner;
public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price");
        int cp = sc.nextInt();
        System.out.println("Enter Selling Price");
        int sp = sc.nextInt();
        // Conditon
        if(sp>cp)
        {
            System.out.println("Profit");
            System.out.println("Profit = "+ (sp-cp));
        }
        if(cp>sp)
        {
            System.out.println("Loss");
            System.out.println("Loss = "+ (cp-sp));
        }
        if(cp==sp)
        {
            System.out.println("No Profit No Loss");
        }
    }
}
