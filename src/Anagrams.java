import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        sc.close();

        System.out.println(isAnagram(a, b) ? "Anagrams" : "Not Anagrams");
    }

    private static boolean isAnagram(String a, String b) {

        if (a.length() != b.length())
            return false;

        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(bChars);

        return Arrays.equals(aChars, bChars);
    }
}
