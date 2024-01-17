import java.util.HashMap;
import java.util.Map;

class SingleNumber{
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,1,1,1,2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : arr){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 == 1){
                System.out.println(entry.getKey());
            }
        }
    }
}