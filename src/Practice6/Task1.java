package Practice6;

public class Task1 {
    public static void main(String args[]){
        try {
            int testCases[][] = {{1,2}, {3,4,5}, {6,7,8,9}, {}};

            for (int i = 0; i < 999999; i++)
                System.out.println(testCases[i]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e);
        }

        finally {

            try {
                throw new ArrayIndexOutOfBoundsException();
            }
            catch (Exception e){
                System.out.println("Again? Seriously?");
            }
        }
    }
}
