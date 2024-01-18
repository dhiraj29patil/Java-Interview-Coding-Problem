import java.util.ArrayList;

class Duplicates{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 3, 6, 1};
        int max = Integer.MIN_VALUE;

        for(int i : arr){
            max = Math.max(i, max);
        }

        int[] freq = new int[max+1];

        for(int i : arr){
            freq[i]++;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < freq.length; i++){
            if(freq[i] >= 2){
                list.add(i);
            }
        }

        System.out.println(list);
    }
}