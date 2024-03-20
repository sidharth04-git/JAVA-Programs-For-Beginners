package LOOPsInJava;

public class OddNumberFrom1to100 {
    public static void main(String[] args) {
        for(int i=0; i<=100; i++)
        {
            if(i%2==0)
            {
                continue; // Particular Iteration ko skip kr dega
            }
            System.out.println(i);
        }
    }
}
