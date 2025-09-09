public class tilingproblem {
    public static int totiling(int n) {
        if (n == 0 || n == 1) {//base case
            return 1;
        }
        int fn1 = totiling(n - 1);
        int fn2 = totiling(n - 2);
        int toways = fn1 + fn2;
        return toways;

    }

    public static void main(String[] args) {
        System.out.println(totiling(3 ));
        
    }
    
}
