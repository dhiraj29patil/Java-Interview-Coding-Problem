public class Remove_Vowel{
    public static boolean isVowel(char ch){
        
        ch = Character.toLowerCase(ch);

        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public static void main(String[] args) {
        String str = "dhiraj";

        String ans = "";

        for(char ch : str.toCharArray()){
            if(!isVowel(ch)){
                ans += ch;
            }
        }

        System.out.println(ans);
    }
}