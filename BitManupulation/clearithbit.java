
public class clearithbit {
    public static int toclear(int n, int i){
        int bitMask =~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(toclear(10,1) );
        
    }
    
}
