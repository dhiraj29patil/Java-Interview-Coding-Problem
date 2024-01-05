public class Vowel_or_Consonent{
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);

        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public static void main(String[] args) {
        char ch = 'A';

        if(isVowel(ch)){
            System.out.println(ch+" is a Vowel");
        }
        else{
            System.out.println(ch+" is a Consonent");
        }
    }
}