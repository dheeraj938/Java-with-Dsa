public class Rangeprime {
    public static void primerange(int n){
         n = 20;
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println("Not a prime number");
                
            }
            else{
                System.out.println(n);
            }
        }
    }
    public static void main(String[] args) {
        primerange(20);
    }
    
}
