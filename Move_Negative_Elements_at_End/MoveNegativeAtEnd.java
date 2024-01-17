import java.util.ArrayList;
import java.util.Arrays;

class MoveNegativeAtEnd{
    public static void main(String[] args) {
        int[] arr = {-4,2,3,-6,1,-8};

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                neg.add(arr[i]);
            }
            else{
                pos.add(arr[i]);
            }
        }
        int count = 0;
        for(int n : pos){
            arr[count++] = n;
        }
        for(int n : neg){
            arr[count++] = n;
        }

        System.out.println(Arrays.toString(arr));
    }
}