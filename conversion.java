public class conversion {
    public static void bintodec(int binNum){
        int pow = 0;
        int decimal = 0;
        while(binNum>0){
            int lastdigit = binNum%10;
            decimal = decimal+ (lastdigit *(int)  Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println(binNum + decimal);

    }

        public static void main(String[] args) {
            bintodec(1011);
           
        }

      
    
}
