import java.util.ArrayList;

class RemoveDuplicates{
    public static void main(String[] args) {
        String str = "Hello";

        ArrayList<Character> list = new ArrayList<>();

        for(char ch : str.toCharArray()){
            if(!list.contains(ch)){
                list.add(ch);
            }
        }
        String ans = "";
        for(char ch : list){
            ans += ch;
        }

        System.out.println(ans);
    }
}