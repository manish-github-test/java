public class fibonacci_seq {
    public static void fibo(int n, int a, int b) {
        if (n == 0) {

            return;
        }

        int c = a + b;
        System.out.println(c);
        fibo(n - 1, b, c);
    }

    public static void main(String[] args) {
        int a = 0;
        int n = 7;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        fibo(n - 2, 0, 1);

    }

}
