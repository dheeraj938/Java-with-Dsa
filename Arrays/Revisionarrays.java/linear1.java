

public interface linear1 {
    public static int Tolinear(int number[],int key){
        for(int i =0 ; i<number.length ; i++){
            if (number[i] == key) {
                return i;
                
            }
           

           
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int number[]={2,4,6,8,10,12,14,16};
         int key = 10;
         int index = Tolinear(number, key);
         System.out.println(index);
    }
    
}
