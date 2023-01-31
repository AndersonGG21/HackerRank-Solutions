import java.util.Locale;
import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
    
        Locale IN = new Locale("en", "in");
        
        System.out.println("US: " + printPayment(Locale.US, payment));
        System.out.println("India: " + printPayment(IN, payment));
        System.out.println("China: " + printPayment(Locale.CHINA, payment));
        System.out.println("France: " + printPayment(Locale.FRANCE, payment));
    }

    public static String printPayment(Locale locale, double payment){
        java.text.NumberFormat nf = java.text.NumberFormat.getCurrencyInstance(locale);
        return nf.format(payment);
    };
}
