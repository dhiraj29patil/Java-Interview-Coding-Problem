import java.util.Arrays;

public class Rotate_Array{
    public static void main(String[] args){
        // Rotate towards right
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;  //Number of places to rotate

        k %= arr.length;

        rotateArray(arr, 0, k);
        rotateArray(arr, k+1, arr.length-1);
        rotateArray(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}