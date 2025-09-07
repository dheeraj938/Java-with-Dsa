public class fibnonacci {
    public static int Tofib(int n) {
        if (n == 0 || n == 1) {
            return n;

        }
        int fibn1 = Tofib(n - 1);
        int fibn2 = Tofib(n - 2);
        int fib = fibn1 + fibn2;
        return fib;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Tofib(n));

        
    }
    
}
