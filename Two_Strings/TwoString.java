import java.util.ArrayList;

class TwoString {
    public static void main(String[] args) {
        String s1 = "art";
        String s2 = "ant";

        ArrayList<Character> list = new ArrayList<>();

        for (char ch : s1.toCharArray()) {
            list.add(ch);
        }

        for (char ch : s2.toCharArray()) {
            if (list.contains(ch)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }
}