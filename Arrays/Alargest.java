import java.util.*;


public class Alargest {

    public static int getlargest(int number[]){
       
           int largest = Integer.MIN_VALUE;
           for(int i=0; i<number.length; i++){
            if(number[i] >largest){
                largest =number[i];
            }
           }
        return largest;

                }
        
    
    public static void main(String[] args) {
        int number[] = {1,2,6,3,5,500};
        System.out.println("largest number  is " + getlargest(number));

    }
    
}
