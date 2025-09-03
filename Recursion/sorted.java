public class sorted {
    public static boolean tosorted (int arr[] ,int i){
        if (i==arr.length-1) {// base case
            return true;

            
        }
        if(arr[i]> arr[i+1]){
            return false;

        }
        return tosorted(arr, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5, 4};
        System.out.println(tosorted(arr,  0));

        
    }
    
}
