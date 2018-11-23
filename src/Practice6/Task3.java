package Practice6;

public class Task3 {

    public static void main(String args[]){
        try {
            throw new MyException("MyException in TRY block for some reason...");
        }
        catch (MyException e){
            System.out.println(e.getString());
        }
        finally {
            System.out.println("Ping from FINALLY block");
        }
    }

    private static class MyException extends Exception{
        private String exeptionString;

        public MyException(String exeptionString) {
            this.exeptionString = exeptionString;
        }

        public String getString(){
            return exeptionString;
        }
    }
}
