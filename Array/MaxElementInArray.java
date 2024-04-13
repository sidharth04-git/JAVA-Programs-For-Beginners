package Array;
class Array{
    void MaxInArray(){
        int arr[] = {5,8,9,12};
        int max = -1;  // smaller number lege
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
                    max = arr[i];
        }
        System.out.println("Maximum Element is " +max);

    }


}
public class MaxElementInArray {
    public static void main(String[] args) {
        Array obj = new Array();
        obj.MaxInArray();
    }
}
