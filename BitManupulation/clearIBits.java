
public class clearIBits {
    public static int toclear(int n , int i){
        int bitMask = (~0)<<i;
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(toclear(15,2 ));
        
    }
    
}
