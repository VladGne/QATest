package Practice5.Collections.Task1;

import java.util.*;

public class Task1Demo {

    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap();
        Queue<Integer> queue = new PriorityQueue();
        //LinkedList<Integer>

        TreeMap<String, Integer> treeMap = new TreeMap();
        TreeSet<Integer> treeSet = new TreeSet();


        int testCases[][] = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}, {10, 11, 12, 13, 14}};
        String testStrings[][] = {{"s1", "s2"}, {"st1", "st2", "st3"}, {"str1", "str2", "str3", "str4"}, {"strng1", "strng2", "strng3", "strng4", "strng5"}};

        System.out.println("ArrayList");
        for (int[] testCase : testCases)
            for (int element : testCase)
                arrayList.add(element);

        System.out.println(arrayList);
        System.out.println("Remove first element");
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println("Set new first to 1");
        arrayList.set(1, 1);
        System.out.println(arrayList);

        System.out.println("Remove second");
        Iterator<Integer> iteratorArrayList = arrayList.iterator();
        iteratorArrayList.next();
        iteratorArrayList.remove();
        iteratorArrayList.forEachRemaining(integer -> System.out.println(integer));


        System.out.println("hashSet");
        for (int[] testCase : testCases)
            for (int element : testCase)
                hashSet.add(element);

        System.out.println(hashSet);
        System.out.println("Remove first element");
        hashSet.remove(1);
        System.out.println(hashSet);
        System.out.println("add 1");
        hashSet.add(1);
        System.out.println(hashSet);

        System.out.println("Remove second");
        Iterator<Integer> iteratorHashSet = hashSet.iterator();
        iteratorHashSet.next();
        iteratorHashSet.remove();
        iteratorHashSet.forEachRemaining(integer -> System.out.println(integer));


        System.out.println("Queue");
        for (int[] testCase : testCases)
            for (int element : testCase)
                queue.add(element);

        System.out.println(queue);
        System.out.println("Remove first element");
        queue.remove(1);
        System.out.println(queue);
        System.out.println("add 1");
        queue.add(1);
        System.out.println(queue);


        System.out.println("Remove second");
        Iterator<Integer> iteratorQueue = queue.iterator();
        iteratorQueue.next();
        iteratorQueue.remove();
        iteratorQueue.forEachRemaining(integer -> System.out.println(integer));


        System.out.println("hashMap");
        for (int i = 0; i < testCases.length; i++)
            for (int j = 0; j < testCases[i].length; j++)
                hashMap.put(testStrings[i][j], testCases[i][j]);

        System.out.println(hashMap);
        System.out.println("Remove first element");
        hashMap.remove(1);
        System.out.println(hashMap);
        System.out.println("add 1");
        hashMap.put("st1", 666);
        System.out.println(hashMap);
    }
}
