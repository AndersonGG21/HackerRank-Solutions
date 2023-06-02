import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubstringI {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        ArrayList<String> subStrings = new ArrayList<>();
        
        for (int i = 0; i < s.length() - (k-1); i++) {
            subStrings.add(s.substring(i, i+k));
        }
    
        Collections.sort(subStrings, (a,b) -> a.compareTo(b) <= 0 ? -1 : a.compareTo(b) == 0 ? 0 : 1);
        smallest = subStrings.get(0);
        largest = subStrings.get(subStrings.size()-1);
        System.out.println(subStrings);
            
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}