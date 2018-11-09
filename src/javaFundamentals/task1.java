package javaFundamentals;

public class task1 {
    // task 1 - find minimum

    public static void main(String args[]){

        int testCases[][] = {{1,2}, {3,4,5}, {6,7,8,9}};

        for (int i = 0; i < testCases.length; i++)
            System.out.println(String.format("Test case %d - min: %d", i, findMin(testCases[i])));
    }

    private static int findMin(int args[]){

        Integer min;

        if (args.length == 0){
            min = null;
        }

        else{
            min = args[0];
            for (int i : args)
                min = i < min? i : min;
        }

        return min;
    }
}