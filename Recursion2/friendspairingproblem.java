public class friendspairingproblem {
    public static int tofriend(int n) {
        if (n == 1 || n == 2) 
        {
            return n;
        }
        return tofriend(n - 1) + (n - 1) * tofriend(n - 2);
    } 
    
public static void main(String[] args) {
    System.out.println(tofriend(5));
}
}
