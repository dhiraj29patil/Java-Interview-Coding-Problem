public class Remove_Character_except_Alphabets{
    public static boolean isAlphabet(char ch){
        ch = Character.toLowerCase(ch);

        return (ch >= 97 && ch <= 122);
    }
    public static void main(String[] args) {
        String str = "D0h@i&r3aj-";

        String ans = "";

        for(char ch : str.toCharArray()){
            if(isAlphabet(ch)){
                ans += ch;
            }
        }

        System.out.println(ans);
    }
}