import java.util.HashMap;

class WordPattern{
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        String[] str = s.split(" ");

        if(str.length != pattern.length()){
            System.out.println("Pattern Not Matching");
            return;
        }

        HashMap<Character, String> map = new HashMap<>();

        for(int i = 0; i < str.length; i++){
            
            char ch = pattern.charAt(i);
            boolean containsKey = map.containsKey(ch);

            if(map.containsValue(str[i]) && !containsKey){
                System.out.println("Pattern Not Matching");
                return;
            }

            if(containsKey && !map.get(ch).equals(str[i])){
                System.out.println("Pattern Not Matching");
                return;
            }
            else{
                map.put(ch, str[i]);
            }
        }
        System.out.println("Pattern Matching");
    }
}