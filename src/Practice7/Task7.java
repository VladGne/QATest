package Practice7;

public class Task7 {

    public static void main(String args[]) {

        String testCase = "password wword word Heeeeeeello";

        String pattern = "(.)\\1+";
        String preperedTestCase  = testCase.replaceAll( pattern, "*");

        String result = "";
        String[] textArray = preperedTestCase.split(" ");

        for (String string : textArray)
            if(!string.contains("*"))
                result += string;

        System.out.print(result);
    }
}