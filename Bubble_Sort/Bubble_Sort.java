import java.util.Arrays;

public class Bubble_Sort{
    public static void main(String[] args){
        int[] arr = {4,1,2,6,3,8,5,7};

        boolean isSort = false;

        for(int i = 0; i < arr.length-1; i++){
            isSort = false;
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    isSort = true;
                }
            }
            if(isSort == false){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}