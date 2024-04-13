package Array;

public class TwoDArrayTraversal {
    public static void main(String[] args) {
        int arr[][] = {{4,5,6},{7,8,4}};
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.println(arr[i][j]);
            }
        }

    }
}
