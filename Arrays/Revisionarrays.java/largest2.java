

public class largest2 {
    public static int Tolargest(int number[] ){
         int largest =Integer.MIN_VALUE;
        for(int i =0; i<number.length; i++){
           

            if (largest<number[i]) {
                largest=number[i];
               
                
            }
        }
         return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,2,6,3,5};
        int result = Tolargest(number);
        System.out.println(result);

    }
    
}
