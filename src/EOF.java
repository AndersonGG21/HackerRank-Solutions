import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index = 1;

        while(scan.hasNext()){
            String val = scan.nextLine();
            System.out.println(index + " " + val);
            index++;
        }

        scan.close();
    }
}
