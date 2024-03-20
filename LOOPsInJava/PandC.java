package LOOPsInJava;
import java.util.Scanner;
public class PandC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        System.out.println("Enter r ");
        int r = sc.nextInt();
        int nfact = 1;
        for(int i=2; i<=n; i++)
        {
            nfact*=i;
        }
        int rfact = 1;
        for(int i=2; i<=r; i++)
        {
            rfact*=i;
        }
        int nrfact = 1;
        for(int i=2; i<=(n-r); i++)
        {
            nrfact*=i;
        }
        int combination = nfact/(rfact*nrfact);
        System.out.println(combination);
    }
}
