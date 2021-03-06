package Practice7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    public static void main(String args[]) {

        String[] testCases = new String[]{"12/12/2012", "31/22/2013", "44/04/2014", "51/55/2500"};

        String regex = "((0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[1-2])/([1-9][0-9][0-9][0-9]))";

        Pattern pattern = Pattern.compile(regex);

        for (String testCase : testCases) {
            Matcher matcher = pattern.matcher(testCase);
            System.out.print(testCase + " - " + matcher.matches() + "\n");
        }
    }
}
