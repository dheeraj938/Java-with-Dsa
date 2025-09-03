import java.util.*;

public class length {
    public static void toPrint( String str){
        for(int i =0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        String fullName= "Dheeraj Kumar";
        System.out.println(fullName.length());

        //Concatenation
  
        String firstName="Dheeraj";
        String lastName="Kumar";
        String fullName2 = firstName +  " " + lastName;
        System.out.println(fullName2.charAt(2));
toPrint( fullName);
    }
    
}
