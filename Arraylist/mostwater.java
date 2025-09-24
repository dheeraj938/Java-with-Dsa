import java.util.*;

public class mostwater {
    // public static int storewater(ArrayList<Integer> height) {
    //     int maxwater = 0;
    //     //burteforce
    //     for (int i = 0; i < height.size(); i++) {
    //         for (int j = i + 1; j < height.size(); j++) {
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int water = j - i;
    //             int currwater = ht * water;
    //             maxwater = Math.max(maxwater, currwater);

    //         }

    //     }
    //     return maxwater;
    // }
    // 2 pointer approach
    public static int storewater(ArrayList<Integer> height) {
        int maxWater = 0;

        int lp = 0;
        int Rp = height.size() - 1;
        while (lp < Rp) {
            //water area
            int ht = Math.min(height.get(lp), height.get(Rp));
            int width = Rp - lp;
            int currwater = ht * width;
            maxWater = Math.max(maxWater, currwater);

            //updateptr
            if (height.get(lp) < height.get(Rp)) {
                lp++;

            } else {
                Rp--;
            }

        }
        return maxWater;


    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println();
        System.out.println(storewater(height));

    }

}
