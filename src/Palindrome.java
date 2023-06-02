import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reversed = "";

        sc.close();

        int lowerCase = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) >= 97 && A.charAt(i) <= 122) {
                lowerCase++;
            }
        }

        if (lowerCase < 50) {
            for (int i = A.length() - 1; i > -1; i--) {
                reversed += A.charAt(i);
            }
        }

        String sol = reversed.compareTo(A) == 0 ? "Yes" : "No";
        System.out.println(sol);
    }
}
