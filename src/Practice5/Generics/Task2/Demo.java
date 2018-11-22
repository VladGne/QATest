package Practice5.Generics.Task2;

public class Demo {

    private static <T extends Comparable<T>> boolean compare(T element11, T element2) {

        return element11.compareTo(element2) == 0;
    }

    public static void main(String args[]){

        String testString1 = "txt1";
        String testString2 = "txt2";
        String testString3 = "text3";

        System.out.println(compare(testString1,testString1));
        System.out.println(compare(testString1,testString2));
        System.out.println(compare(testString1,testString3));
    }
}


