// Sample Input:    
//                 2
//                 0 2 10
//                 5 3 5
// Sample Output:
//                 2 6 14 30 62 126 254 510 1022 2046
//                 8 14 26 50 98

import java.util.*;

class LoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int res = (int) (a + Math.pow(2, 0) * b);

            System.out.print(res + " ");
            for (int j = 1; j < n; j++) {
                res += Math.pow(2, j) * b;
                System.out.print(res + " ");
            }
            System.out.println();
        }
        in.close();
    }
}