package Array;
class ArraySum{
    void sumOfArray(){
        int arr[] = {1,5,3};
        int sum = 0; // store the sum of elements
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);  // Output --> 9
    }
}
public class SumOfElenents {
    public static void main(String[] args) {
        ArraySum obj = new ArraySum();
        obj.sumOfArray();


    }
}
