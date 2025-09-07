public class fact {
    public static int Tofact(int n) {
        if (n == 0) {
             
            return 1;
        }
        int f1 = Tofact (n - 1);
        int f2 = n * f1;
        return f2;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Tofact(n));
        
    }

    
}
