package Practice6;

import java.util.Scanner;

public class Task4 {

    public static void main(String args[]){
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter number from 1 to 4");
                int number = scanner.nextInt();
                switch (number){
                    case 1: throw new MyException("MyException in TRY block for some reason...");
                    case 2: throw new NestedExecption("NestedExecption in TRY block for some reason...");
                    case 3: throw new OverNestedExecption("OverNestedExecption in TRY block for some reason...");
                    case 4: throw new Exception("Number 4 exception");
                    default: throw new ArrayIndexOutOfBoundsException("Stupid user exception");
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Ping from FINALLY block");
            }
        }
    }

    private static class MyException extends Exception{
        private String exeptionString;

        public MyException() {
        }

        public MyException(String exeptionString) {
            this.exeptionString = exeptionString;
        }

        @Override
        public String getMessage(){
            return exeptionString;
        }
    }

    private static class NestedExecption extends MyException{
        private String exeptionString;
        public NestedExecption(String exeptionString) {
            this.exeptionString = exeptionString;
        }
        public NestedExecption() {
        }

        @Override
        public String getMessage(){
            return exeptionString;
        }
    }

    private static class OverNestedExecption extends NestedExecption{
        private String exeptionString;

        public OverNestedExecption(String exeptionString) {
            this.exeptionString = exeptionString;
        }

        @Override
        public String getMessage(){
            return exeptionString;
        }
    }
}
