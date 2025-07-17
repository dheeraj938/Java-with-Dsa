import java.util.Scanner;

public class looploop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        while(true){
            if(num%10==0){
                continue;
            }
            System.out.println(num);
            System.out.println("enter your number");
            num = sc.nextInt();
        }
    }
}   
        

