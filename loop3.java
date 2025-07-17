import java.util.*;
public class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(true){
            if(num%10 ==0){
                System.out.println("exit");
                break;
            }
            System.out.println(num);
            System.out.println("enter your number");
            num = sc.nextInt();
        }
        
    }
    
}
