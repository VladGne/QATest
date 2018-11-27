package Practice7;

public class Task7 {

    public static void main(String args[]) {

        String testCase = "password wword word Heeeeeeello";
        String pattern = "\\s*\\b[A-Za-z]*(\\w+)\\1+(\\w*)\\b\\s*";
        String result  = testCase.replaceAll( pattern, "");
        System.out.print(result);
    }
}