package Practice7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String args[]){

        String testCase= "Word cAT DATA A site Java tExt";

        String regex = "\\b[A-Z][A-Za-z]*\\s";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testCase);

        while(matcher.find()) {
            System.out.print(testCase.substring(matcher.start(), matcher.end()));
        }
    }
}
