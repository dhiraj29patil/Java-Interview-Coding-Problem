class LongestPalindromicSubstring{
    public static void main(String[] args) {
        String s = "dabbababadhji";
        String str = "";

        for(int i = 1; i < s.length(); i++){
            int low = i;
            int high = i;

            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()){
                    break;
                }
            }

            String palindrome = s.substring(low+1, high);
            if(palindrome.length() > str.length()){
                str = palindrome;
            }

            low = i-1;
            high = i;

            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()){
                    break;
                }
            }

            palindrome = s.substring(low+1, high);
            if(palindrome.length() > str.length()){
                str = palindrome;
            }
        }

        System.out.println(str);
    }
}