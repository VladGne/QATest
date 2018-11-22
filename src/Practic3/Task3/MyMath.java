package Practic3.Task3;

public class MyMath {

    public static int Min(int[] array){
        Integer min;

        if (array.length == 0)
            min = null;

        else{
            min = array[0];
            for (int i : array)
                min = i < min? i : min;
        }

        return min;
    }

    public static double Min(double[] array){
        Double min;

        if (array.length == 0)
            min = null;

        else{
            min = array[0];
            for (double i : array)
                min = i < min? i : min;
        }

        return min;
    }

    public static int Max(int[] array){
        Integer max;

        if (array.length == 0)
            max = null;

        else{
            max = array[0];
            for (int i : array)
                max = i > max ? i : max;
        }

        return max;
    }

    public static double Max(double[] array){
        Double max;

        if (array.length == 0)
            max = null;

        else{
            max = array[0];
            for (double i : array)
                max = i > max ? i : max;
        }

        return max;
    }

    public static int Pow(int base, int exponent){
        int result=1;

        for (int i = 0; i<exponent; i++)
            result *= base;
        return result;
    }

    public static double Pow(double base, int exponent){
        double result=1;

        for (int i = 0; i<exponent; i++)
            result *= base;
        return result;
    }

    public static int NextAfter(int[] array, int number){

        int result = 0;
        for (int i : array)
            if (i > number)
                return i;

        return result;
    }

    public static double NextAfter(double[] array, double number){

        double result = 0;
        for (double i : array)
            if (i > number)
                return i;

        return result;
    }
}
