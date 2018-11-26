package Practice7;

public class Task3 {

    public static void main(String args[]){

        String testCase= "  Removing        Extra Spaces       Between Words in  the             text  ";

        String result = testCase.trim().replaceAll(" +", " ");

        System.out.print(result);
    }
}
