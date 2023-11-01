import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RefactorDates {
    public static void main(String[] args) {
        List<String> dates = new ArrayList<>();
        List<String> results = new ArrayList<>();
        dates.add("26th May 1960");
        dates.add("6th Jun 1933");
        dates.add("26th May 1980");
        String regex = "(st|nd|rd|th)\\b";

        Pattern pattern = Pattern.compile(regex);
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");


        try {
            for (String date : dates
                 ) {
                Matcher matcher = pattern.matcher(date);
                String newDateStr = matcher.replaceAll("");
                Date newDate = customParseDate(newDateStr);
                results.add(outputFormat.format(newDate));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(results.toString());
    }

    public static Date customParseDate(String date) throws ParseException {
        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");

        String[] parts = date.split(" ");
        String day = parts[0];
        String month = monthMap.get(parts[1]);
        String year = parts[2];

        String formattedDate = day + " " + month + " " + year;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        return dateFormat.parse(formattedDate);
    }
}
