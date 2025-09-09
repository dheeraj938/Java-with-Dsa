public class poweroptimized {
    public static int toPower(int a, int n) {
        if (n == 0) {
            return 1;

        }
        int halfpower = toPower(a, n / 2);
        int halfpowersquare = halfpower * halfpower;
        // for odd
        if (n % 2 != 0) {
           halfpowersquare = a* halfpowersquare;

        }
        return halfpowersquare;
    }

    public static void main(String[] args) {
        System.out.println(toPower(2, 5));
        
    }
    
}
