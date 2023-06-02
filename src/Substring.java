// Given a string,s , and two indices, start and end , print a substring consisting of all characters in the inclusive range from start to end.
import java.util.*;

public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        System.out.println(S.substring(start, end));
    }
}