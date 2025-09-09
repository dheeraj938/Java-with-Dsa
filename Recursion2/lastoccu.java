public class lastoccu {
    public static int tolast(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;

        }
        int isFound = tolast(arr, key, i+1);
        if (isFound != -1) {
            return isFound;

        }
        if (arr[i] == key) {
            return i;
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 5, 5 };
        System.out.println(tolast(arr, 05, 0));

        
    }
    
}
