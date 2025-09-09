public class power {
    public static int Topower(int n, int x) {
        if (n == 0) {
            return 1;

        }
       int  xn1 = Topower(n-1, x);
       int xn2 = x * xn1;
        return xn2;
    }

    public static void main(String[] args) {
       
        System.out.println(Topower(10 ,2));
        
    }
    
}
