public class sorted {
    public static boolean toSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;

        }
        if (arr[i] > arr[i + 1]) {
            return false;

        }
        return toSorted(arr, i + 1);
        
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(toSorted(arr, 0));

    }
    
}
