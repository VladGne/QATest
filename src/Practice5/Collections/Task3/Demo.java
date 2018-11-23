package Practice5.Collections.Task3;

public class Demo {

    public static void main(String args[]){

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("List:");
        list.printAll();

        System.out.println("\nReversed List:");
        list.revese();
        list.printAll();

        System.out.println("\nList without 3");
        list.remove(2);
        list.printAll();

        System.out.println("\nReversed again:");
        list.revese();
        list.printAll();

        MyLinkedList<Integer>.Iterator iterator  = list.new Iterator();

        System.out.println("\nRemove all:");
        while(iterator.hasNext()){
            iterator.remove(0);
            list.printAll();
            System.out.println("\n");
        }

    }
}
