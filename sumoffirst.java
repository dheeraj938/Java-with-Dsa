import java.util.*;
public class sumoffirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int value = 1;
        while(value<=n){
            sum = sum + value;
            
            value++;
        }
        System.out.println(sum);
    }
    
}
