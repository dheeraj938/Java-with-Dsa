
public class print_1_to_n {
    public static void toincreasing(int n){
        if( n==1){
            System.out.println(1);
            return;
        }
        toincreasing(n-1);
        System.out.println(n +" ");
    }
    public static void main(String[] args) {
        int n =5
         ;
        toincreasing(n-1);
        
    }
    

}
 