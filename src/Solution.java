// Problem:
// Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes.

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int whiteSpaces = 15 - s1.length();
                String concat = "";
                
                for(int j=0; j < whiteSpaces; j++){
                    concat += " ";
                }   
                
                int length = String.valueOf(x).length();

                switch(length){
                    case 1 : 
                    System.out.println(s1 + concat + "00"+x);
                    break;   
                    case 2 :
                    System.out.println(s1 + concat + "0"+x);
                    break;
                    default:   
                    System.out.println(s1 + concat + x);
                    break;
                }
    
            }
            sc.close();
            System.out.println("================================");

    }
}
