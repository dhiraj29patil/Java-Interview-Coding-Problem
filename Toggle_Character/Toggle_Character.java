public class Toggle_Character{
    public static void main(String[] args) {
        String str = "dHiraj";
        String ans = "";

        for(char ch : str.toCharArray()){
            if(Character.isLowerCase(ch)){
                ans += Character.toUpperCase(ch);
            }
            else{
                ans += Character.toLowerCase(ch);
            }
        }

        System.out.println(ans);
    }
}