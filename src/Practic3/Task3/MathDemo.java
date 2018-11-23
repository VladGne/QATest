package Practic3.Task3;

public class MathDemo {

    public static void main(String args[]){

        int integerTestCases[][] = {{1,2}, {3,4,5}, {6,7,8,9}};
        double doubleTestCases[][] = {{1.0,2.0}, {3.0,4.0,5.0}, {6.0,7.0,8.0,9.0}};

        final int borderInt = 4;
        final double borderDouble = 4;
        final int exponent = 2;


        for (int i = 0; i < integerTestCases.length; i++)
            System.out.println(String.format("Test case %d - min integer: %d", i, MyMath.Min(integerTestCases[i])));

        for (int i = 0; i < integerTestCases.length; i++)
            System.out.println(String.format("Test case %d - max integer: %d", i, MyMath.Max(integerTestCases[i])));

        for (int i = 0; i < integerTestCases.length; i++)
            System.out.println(String.format("Test case %d - next after %d in int array: %d", i, borderInt,MyMath.NextAfter(integerTestCases[i], borderInt)));

        System.out.println(String.format("4^2 = %d", MyMath.Pow(borderInt, exponent)));


        for (int i = 0; i < doubleTestCases.length; i++)
            System.out.println(String.format("Test case %d - min double: %.2f", i, MyMath.Min(doubleTestCases[i])));

        for (int i = 0; i < doubleTestCases.length; i++)
            System.out.println(String.format("Test case %d - max double: %.2f", i, MyMath.Max(doubleTestCases[i])));

        for (int i = 0; i < doubleTestCases.length; i++)
            System.out.println(String.format("Test case %d - next after %.2f in double array: %.2f", i, borderDouble,MyMath.NextAfter(doubleTestCases[i], borderDouble)));

        System.out.println(String.format("4^2 = %.2f", MyMath.Pow(borderDouble, exponent)));

    }
}
