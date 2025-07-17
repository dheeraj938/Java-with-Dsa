public class largestnumber {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i =0; i<numbers.length; i++){
            if(largest< numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {25,84,96,25,04,8,56};
        System.out.println(getlargest(numbers));
    }
    
}
