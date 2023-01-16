// There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.
// If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.


import java.util.Scanner;

public class StaticInitializationBlocks {

    static boolean flag = false;
    static int B = 0;
    static int H = 0;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();

        if ((B > 0 && H > 0)) {
            flag = true;
        } else if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive"); //Search how to throw a exception
            // throw new java.lang.Exception("Breadth and height must be positive");
        }

        scan.close();
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
