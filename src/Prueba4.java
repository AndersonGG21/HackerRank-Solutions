public class Prueba4 {
    public static void main(String[] args) {
        int[] myArray = {1,2,1,3,3,1,2,1,5,1};
        int[] histogram = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            int num = myArray[i];
            histogram[num - 1]++;
        }

        for (int i = 0; i < histogram.length; i++) {
            int frecuency = histogram[i];
            System.out.print((i+1) + ": " );

            for (int j = 0; j < frecuency; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
