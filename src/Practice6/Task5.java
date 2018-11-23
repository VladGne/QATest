package Practice6;

public class Task5 {

    public static void main(String args[]){

        A[] object = new A[3];
        object[0] = new C();
        object[1] = new B();
        object[2] = new A();

        try {
            object[0].throwEx();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            object[1].throwEx();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            object[2].throwEx();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
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

    private static class A{

        public void throwEx() throws MyException{
            throw new MyException("Base exception");
        }
    }

    private static class B extends A{

        @Override
        public void throwEx() throws NestedExecption {
            throw new NestedExecption("Level 1 exception");
        }
    }

    private static class C extends B{

        @Override
        public void throwEx() throws OverNestedExecption {
            throw new OverNestedExecption("Level 2 exception");
        }
    }
}
