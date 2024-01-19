import java.util.HashMap;
import java.util.Map;

class MajorityElement{
    public static void main(String[] args) {
        int[] arr = {3,1,3,3,2,2,2,2,1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }

        int element = 0;
        int max = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                element = entry.getKey();
            }    
        }

        System.out.println("Majority Element : "+element);
    }
}