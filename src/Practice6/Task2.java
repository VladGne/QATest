package Practice6;

public class Task2 {
    public static void main(String args[]){
        try {
            int testCases[][] = {{1,2}, {3,4,5}, {6,7,8,9}, {}};

            for (int i = 0; i < 999999; i++)
                System.out.println(testCases[i]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }

        finally {

            try {
                throw new Exception();
            }
            catch (Exception e){
                System.out.println("Again? Seriously? Error: " + e.getMessage());
            }
            finally {
                System.out.println("Ping from FINALLY block");
            }
        }
    }


}



