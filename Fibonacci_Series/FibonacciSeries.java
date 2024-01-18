import java.util.Arrays;

class FibonacciSeries{
    public static void main(String[] args) {
        int num = 8; //how much fibonacci numbers do you want

        int[] fibo = new int[num];

        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i < num; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        System.out.println(Arrays.toString(fibo));
    }
}