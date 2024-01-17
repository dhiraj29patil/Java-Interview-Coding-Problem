import java.util.ArrayList;
import java.util.Arrays;

class RearrangeArray{
    public static void main(String[] args) {
        /*Rearrange an array in such a way that even elements get even position & odd elements get odd position */

        int[] arr = {3,6,12,1,5,8};

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int n : arr){
            if(n % 2 == 0){
                even.add(n);
            }
            else{
                odd.add(n);
            }
        }

        int e = 0;
        int o = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                arr[i] = even.get(e++);
            }
            else{
                arr[i] = odd.get(o++);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}