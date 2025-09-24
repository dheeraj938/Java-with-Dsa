import java.util.*;
public class A_sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);//asending order
        //desending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        
                                        

    
    }
    
}
