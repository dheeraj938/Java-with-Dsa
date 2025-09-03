

public class setithbit {
    public static int tosetithbit(int n , int i){
        int bitMask = 1<<i;  
        return n| bitMask;
            
        
    }
    public static void main(String[] args) {
        System.out.println(tosetithbit(10,2 ));
        
    }
    
}
  