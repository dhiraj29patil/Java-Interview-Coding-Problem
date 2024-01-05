public class Reverse_Integer_Number{
    public static void main(String[] args){
        int num = 1234;
        int rem = 0;
        int rev = 0;

        while(num != 0){
            rem = num % 10;
            rev = rem + rev * 10;
            num /= 10;
        }

        System.out.println("Reverse Number : "+rev);
    }
}