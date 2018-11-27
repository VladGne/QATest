package Practice5.Collections.Task3;

public class Demo {

    public static void main(String args[]){

        MyLinkedList<Integer> list = new MyLinkedList<>();

        for (int i=1; i<=10; i++)
            list.add(i);

        System.out.println("List:");
        list.printAll();

        System.out.println("\nRemove element:");
        list.remove(5);
        list.printAll();

        System.out.println("\nReversed List:");
        list.revese();
        list.printAll();
//
//        System.out.println("\nList without 3");
//        list.remove(2);
//        list.printAll();
//
//        System.out.println("\nReversed again:");
//        list.revese();
//        list.printAll();
//
//        MyLinkedList<Integer>.Iterator iterator  = list.new Iterator();
//
//        System.out.println("\nRemove all:");
//        while(iterator.hasNext()){
//            iterator.remove(0);
//            list.printAll();
//            System.out.println("\n");
//        }

    }
}
