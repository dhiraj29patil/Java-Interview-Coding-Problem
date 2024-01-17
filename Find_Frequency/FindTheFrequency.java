import java.util.HashMap;

class FindTheFrequency{
    public static void main(String[] args) {
        int[] arr = {5,1,1,1,4,1,7,1};
        int num = 1; //number whose we want to get the frequency.
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }

        int n = map.getOrDefault(num, 0);

        System.out.println("Frequency of "+num+" is : "+n);
    }
}