public class Binarystringproblem {
    public static void toBinary(int n, int lastPlace, StringBuilder str) {
        //base case
        if (n == 0) {
            System.out.println(str);
            return;
            
        }
        //work

        if (lastPlace == 0)

        {
            //sit 0 on chair n
            toBinary(n - 1, 0, str.append("0"));
            toBinary(n - 1, 1, str.append("1"));
        } else {
            toBinary(n - 1, 0, str.append("0"));
        }
    }

    public static void main(String[] args) {
        toBinary(3, 0, new StringBuilder(" "));
        
        
    }
    
}
