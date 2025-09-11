public class quicksort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        ;
    }
    
    public static void toquicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        //last element
        int Pidx = partition(arr, si, ei); //find a index of it
        toquicksort(arr, si, Pidx - 1);//for left
        toquicksort(arr, Pidx + 1, ei);//for right
    }
    
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        toquicksort(arr, 0, arr.length - 1);
        printArr(arr);

        
    }
    
}
