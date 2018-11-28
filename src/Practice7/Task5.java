package Practice7;

public class Task5 {

    public static void main(String args[]){

        String testCase= "Regular regular popular expressions entered popular use from 1968 1968 1968";

        String regex = "\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)";

        String result = testCase.replaceAll(regex, "");

        System.out.print(result);
    }
}