public class Sum {
    public static int ToSum(int n) {
        if (n == 1) {
            return 1;

        }
        int sum = ToSum(n - 1);
        int sum1 = n + sum;
        return sum1;

    }
    public static void main(String[] args) {
        int n = 5  ;
        System.out.println(ToSum(n));
    }
    
}
