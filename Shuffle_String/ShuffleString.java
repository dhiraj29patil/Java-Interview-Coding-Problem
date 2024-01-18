import java.util.Arrays;

class ShuffleString{
    public static void main(String[] args) {
        //shuffle string according to the indices array.

        String str = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        char[] ch = new char[str.length()];

        for(int i = 0; i < indices.length; i++){
            ch[indices[i]] = str.charAt(i);
        }

        StringBuilder sb = new StringBuilder("");

        sb.append(ch);

        System.out.println(sb.toString());
    }
}