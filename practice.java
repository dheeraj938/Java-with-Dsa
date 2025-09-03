public class practice{
  public static void reverse( int markes[]){
    int first=0; int last= markes.length-1;
    while (first <last) {
      int temp = markes[first];
      markes[first] = markes[last];
      markes[last] = temp;
      first++;
      last--;

      
    }

    
    

  }
    public static void main(String[] args) {
        
      int markes[]= {1,2,3,4,5,6,7,8,9};
       reverse(markes);
       for(int i=0;i<markes.length;i++){
        System.out.print(markes[i] + " ");
    }
}
}