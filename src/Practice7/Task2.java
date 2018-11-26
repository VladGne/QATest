package Practice7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String args[]){

        String[] testCases = new String[]{"2012","2013", "2014", "2500", "3000", "3500", "4000", "5000", "5042", "5043", "5044"};

        String pattern = "(20[1-9][3-9]|2[1-9][0-9][0-9]|[3-4][0-9][0-9][0-9]|50[0-4][0-3])";

        Pattern p = Pattern.compile(pattern);

        for (String testCase : testCases){
            Matcher m = p.matcher(testCase);
            System.out.print( testCase + " - "+ m.matches() + "\n");
        }
    }
}