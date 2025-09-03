

 public class print_n_to_1 {
    public static void toprint(int n){
        if (n==1) {
        System.out.println(1);
        return ;
            
        }
        System.out.println(n);
        toprint(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        toprint(n);

    }

    
}