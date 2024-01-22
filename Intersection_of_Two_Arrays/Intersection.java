import java.util.ArrayList;
import java.util.HashMap;

class Intersection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 2, 3, 4 };
        int[] arr2 = { 2, 2, 3, 3 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr2) {
            if(map.containsKey(i) && (map.get(i) > 0)){
                list.add(i);
                map.put(i, map.get(i)-1);
            }
            
        }

        System.out.println(list);
    }
}