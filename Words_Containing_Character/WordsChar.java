import java.util.ArrayList;

class WordsChar{
    public static void main(String[] args) {
        
        String[] str = {"Leet","Code","Okay"};
        char ch = 'e';

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < str.length; i++){
            list.add(str[i]);
        }

        int index = 0;

        for(String s : list){
            if(s.contains(Character.toString(ch))){
                ans.add(index);
            }
            index++;
        }

        System.out.println(ans);
    }
}