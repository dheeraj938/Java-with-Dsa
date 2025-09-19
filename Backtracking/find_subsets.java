public class find_subsets {
    public static void tofind_subsets(String str, String ans, int i) {
        //base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        //Yes choice 
        tofind_subsets(str, ans + str.charAt(i), i + 1);
        //no choice
        tofind_subsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        tofind_subsets(str, " ", 0);
        
    }
    
}
