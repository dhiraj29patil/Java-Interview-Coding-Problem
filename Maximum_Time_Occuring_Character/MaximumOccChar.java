import java.util.Map;
import java.util.TreeMap;

class MaximumOccChar{
    public static void main(String[] args){
        
        //Print the character which occur maximum time in Lexicographical order
        
        String str = "testsample";

        TreeMap<Character, Integer> map = new TreeMap<>();

        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        int max = Integer.MIN_VALUE;
        char element = str.charAt(0);

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                element = entry.getKey();
            }
        }
        System.out.println("Repeating Character : "+element);
    }
}