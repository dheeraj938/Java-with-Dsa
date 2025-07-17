import java.util.*;
public class linear{

    public static int linearsearch(int number[], int key){
        for(int i = 0; i<number.length; i++){
            if(number[i]== key){
return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,87,9};
        int key = 10;
        System.out.println("");
    }
}