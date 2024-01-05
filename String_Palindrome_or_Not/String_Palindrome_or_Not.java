public class String_Palindrome_or_Not{
    public static void main(String[] args) {
        String str = "abba";
        String ans = "";

        for(int i = str.length()-1; i >= 0; i--){
            ans += str.charAt(i);
        }

        if(str.equalsIgnoreCase(ans)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is Not Palindrome");
        }
    }
}