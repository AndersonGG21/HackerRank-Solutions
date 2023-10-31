public class Prueba3 {
    public static void main(String[] args) {
        int n = 6; // Tamaño de la X

        // Imprimir la X
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - j - 1) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
