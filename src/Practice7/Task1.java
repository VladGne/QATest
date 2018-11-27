package Practice7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String args[]){

        String testCase= "Word cAT DATA A site Java tExt"; // String expectedString =  "Word DATA A Java";

        String pattern = "\\b[A-Z][A-Za-z]*\\s";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testCase);

        while(m.find()) {
            System.out.print(testCase.substring(m.start(), m.end()));
        }
    }
}
