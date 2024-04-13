package Array;
import java.util.Scanner;
import java.util.Arrays;

class ArrayTarget{
    void targetElement()
    {
        int arr[] = {4,8,7,6}; // agar multiple occurance hai toh first occurance chaiyea
        int x = 7;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==x)
            {
                x = i;
                break;
            }
        }
        System.out.println(x);
    }
}

public class FindTargetElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayTarget obj = new ArrayTarget();
        obj.targetElement();

    }
}
