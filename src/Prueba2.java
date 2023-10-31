public class Prueba2 {
    static String[] myArray = {"a", "b", "c", "d", "d", "c", "b", "a"};
    static  int n=8;
    public static void main (String args[]) {

        String myArrayReversedString = "";
        String myArrayString = "";

        for(int i = n-1; i >= 0; i--){
            myArrayReversedString += myArray[i];
        }

        for (int i = 0; i < n; i++) {
            myArrayString += myArray[i];
        }

        String sol = myArrayString.equals(myArrayReversedString) ? "Symetric" : "Not Symetric";
        System.out.println(sol);
    }
}
