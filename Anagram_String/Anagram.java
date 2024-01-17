import java.util.HashMap;

class Anagram{
    public static void main(String[] args) {
        
        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char ch : a.toCharArray()){
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch)+1);
            }
            else{
                map1.put(ch,1);
            }
        }

        for(char ch : b.toCharArray()){
            if(map2.containsKey(ch)){
                map2.put(ch, map2.get(ch)+1);
            }
            else{
                map2.put(ch, 1);
            }
        }

        if(map1.equals(map2)){
            System.out.println("String is Anagram");
        }
        else{
            System.out.println("String is Not Anagram");
        }
    }
}