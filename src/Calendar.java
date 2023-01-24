// A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.
// Returns string: the day of the week in capital letters
// Sample Input : 08 05 2015
// Sample Output : WEDNESDAY

import java.io.*;


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year){
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(year, month-1, day);
        String formatter = new SimpleDateFormat("EEEEE").format(calendar.getTime());
        return formatter.toUpperCase();
    }

}

public class Calendar {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
