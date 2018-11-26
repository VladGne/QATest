package Practice7;

public class Task6 {

    public static void main(String args[]){

        String[] testCases = new String[]{"2012","2013", "2014", "2500", "3003", "3500", "4004", "5001", "5042", "5043", "5044"};

        String pattern = "(.)\\1+";
        String result;

        for (String testCase : testCases){
            result = testCase.replaceAll( pattern, "*");
            System.out.print(testCase + " - " + result + "\n");
        }
    }
}
