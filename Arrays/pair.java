

public class pair {
    public static void getpair(int number[]){
        for(int i =0; i<number.length; i++){
            int cur = number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.print("(" + cur + " , " + number[i] + ")");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int number[]= {2,4,6,8,10};
        getpair(number);


    }
    
}
