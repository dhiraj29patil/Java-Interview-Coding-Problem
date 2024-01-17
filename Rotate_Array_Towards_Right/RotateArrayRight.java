import java.util.Arrays;

class RotateArrayRight{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int places = 2;
        int n = arr.length;

        places %= n;

        rotateArray(arr, 0, n-1);
        rotateArray(arr, 0, places-1);
        rotateArray(arr, places, n-1);
        

        System.out.println(Arrays.toString(arr));

    }

    public static void rotateArray(int[] arr, int start, int end){
        while(start < end){
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }
}