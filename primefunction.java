public class primefunction {

    if(n==2){
        return ture;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, hence not prime
            }
        }
        return true; // n is prime
    }
    public static void main(String[] args) {
        
    }
    
}
