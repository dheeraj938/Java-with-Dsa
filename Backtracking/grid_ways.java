public class grid_ways {
    public static int togrid_ways(int i, int j, int n, int m) {
        //base case
        if (i == n - 1 && j == m - 1) {//condition for last cell
            return 1;

        }
        else if (i == n || j == n) {
            return 0;// boundary cross condition 

        }
        int w1 = togrid_ways(i + 1, j, n, m);
        int w2 = togrid_ways(i, j + 1, n, m);
        return w1 + w2;

    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(togrid_ways(0,0,n,m));
    }
    
}
