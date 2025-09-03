public class mislinious {
    public static int to(int arr[] , int key){
        for(int i = 0; i<=arr.length-1; i++){
            if (arr[i] == key) {
               System.out.println(i);
                
            }
        }
         return -1;

    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10};
        int key = 25;
        
        System.out.println(to(arr, key));
    }
    
}
