
public class maxsubarray2 {
    public static void TomaxsubarraySum(int number[]){
        int curr = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i =0; i<number.length ; i++){
            int start = i;
            for(int j = i ; j<number.length;j++){
                int end = j;
                curr = 0; 
                for(int k =start; k<end ; k++){
                    curr +=number[k];
                     System.out.println(curr);
                    if (maxsum<curr) {
                        maxsum=curr;
                       


                        
                    }
                    
                }
            }           

        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        TomaxsubarraySum(number);
    }
    
}
