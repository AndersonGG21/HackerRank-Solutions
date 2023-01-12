// The first line contains an integer, T , denoting the number of test cases.
// Each test case,T , is comprised of a single line with an integer, n, which can be arbitrarily large or small.

// Output Format

// For each input variable n and appropriate primitive dataType, you must determine if the given primitives are capable of storing it. If yes, then print:
// n can be fitted in:
// * dataType

// If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: byte < short < int < long).

// If the number cannot be stored in one of the four aforementioned primitives, print the line:
// n can't be fitted anywhere.

// Sample Input

// 5
// -150
// 150000
// 1500000000
// 213333333333333333333333333333333333
// -100000000000000

// Sample Output

// -150 can be fitted in:
// * short
// * int
// * long
// 150000 can be fitted in:
// * int
// * long
// 1500000000 can be fitted in:
// * int
// * long
// 213333333333333333333333333333333333 can't be fitted anywhere.
// -100000000000000 can be fitted in:
// * long
import java.util.*;

public class DataTypes {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            // In the future use a Map
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= -32768 && x <= 32767) 
                    System.out.println("* short");
                if (x >= -2147483648 && x <= 2147483647)
                    System.out.println("* int");
                if (x >= Math.pow(-2,63) && x <= Math.pow(2, 63)-1)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
        sc.close();
    }
}
