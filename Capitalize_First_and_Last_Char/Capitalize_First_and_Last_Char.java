public class Capitalize_First_and_Last_Char{
    public static void main(String[] args){
        String str = "dhiraj patil from shirpur";
        String[] sArr = str.split(" ");

        String fChar = "";  //first character
        String rChar = "";  //remaining characters
        String lChar = "";  //last Character
        
        String ans = "";

        for(String s : sArr){
            fChar = Character.toString(s.charAt(0));
            rChar = s.substring(1, s.length()-1);
            lChar = Character.toString(s.charAt(s.length()-1));

            ans += fChar.toUpperCase()+rChar+lChar.toUpperCase()+" ";
        }

        System.out.println(ans);
    }
}