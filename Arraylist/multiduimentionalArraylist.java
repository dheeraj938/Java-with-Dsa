// import java.util.*;
// public class multiduimentionalArraylist {
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         mainList.add(list);

//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(3);
//         list2.add(4);
//         mainList.add(list2);

//         for (int i = 0; i < mainList.size(); i++) {
//             ArrayList<Integer> currList = mainList.get(i);
//             for (int j = 0; j < currList.size(); j++) {
//                 System.out.println(currList.get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
    
// }
   

//  problem 2 
import java.util.*;

public class multiduimentionalArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

            List1.add(i * 1);
            List2.add(i * 2);
            List3.add(i * 3);
        }
        mainlist.add(List1);
        mainlist.add(List2);
        mainlist.add(List3);
        System.out.println(mainlist);

        //nested loop
         for(int i= 0; i<mainlist.size() ; i++){
            ArrayList<Integer>currList = mainlist.get(i);
            for(int j = 0 ; j<currList.size(); j++){
                System.out.println(currList.get(j) + " ");
            }
            System.out.println();
         }

          
        
    }

    
}