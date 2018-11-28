package Practice5.Collections.Task3;

public class MyLinkedList<T> {

    private int size = 0;

    transient Node<T> first;
    transient Node<T> last;

    public MyLinkedList(){

   }

    // add en element
    public void add(T element) {

        if (size == 0) {
          first = new Node(element, null, null);
        }
        else if (size == 1){
            last = new Node(element, null, first);
            first.nextNode = last;
        }
        else {
            last.nextNode = new Node(element, null, last);
            last = last.nextNode;
        }

        size++;
    }

    // remove an element
    public void remove(int elementIndex) {

        Iterator iterator = this.new Iterator();
        for (int i = 0; i < elementIndex-1; i++){
            iterator.next();
        }

        Node tmp = iterator.iterator.previousNode;
        iterator.next();
        tmp.nextNode = iterator.iterator;
        iterator.iterator.previousNode = tmp;
        size--;
    }

    // reverse elements
    public  void revese(){
        int swapNumber=0;
        swapNodes(first,last, swapNumber);

        Node tmp = this.last;
        this.last = this.first;
        this.first = tmp;

//        Node tmp = first;
//        first = last;
//        first.nextNode = first.previousNode;
//        first.previousNode = null;
//
//        last = tmp;
//        last.previousNode = last.nextNode;
//        last.nextNode = null;

//       for(int i = 0; i < size; i++)
//        {
//            Object temp = elements[i];
//            elements[i] = elements[size - i - 1];
//            elements[size - i - 1] = temp;
//        }
    }

    public void swapNodes(Node first, Node last, int swapNumber){
        swapNumber++;
        Node tmp1 = first;
        Node tmp2 = last.nextNode;
        first = last;
        first.nextNode = first.previousNode;
        first.previousNode = tmp2;

        tmp2 = tmp1.previousNode;
        last = tmp1;
        last.previousNode = last.nextNode;
        last.nextNode = tmp2;

        if (swapNumber < size/2)
            swapNodes(last.previousNode, first.nextNode, swapNumber);

        if (first.nextNode.equals(last.previousNode)){
            first = first.nextNode;
            tmp1 = first.previousNode;
            first.previousNode = first.nextNode;
            first.nextNode = tmp1;
        }
    }


    public void printAll(){

        Iterator iterator = this.new Iterator();
        for (int i = 0; i < size; i++){
            System.out.println(iterator.iterator.data);
            iterator.next();
        }
    }

    class Iterator{
        Node iterator;

        public Iterator() {
            this.iterator = first;
        }

        public boolean hasNext(){
            return  iterator.nextNode != null;
        }

        public void next(){
            iterator = iterator.nextNode;
        }

       // public T remove(int elementIndex)
            //return MyLinkedList.this.remove(elementIndex);

    }

    class Node<T>{
        T data;
        Node<T> nextNode;
        Node<T> previousNode;

        public Node(T data, Node<T> next, Node<T> previous){
            this.data = data;
            this.nextNode = next;
            this.previousNode = previous;
        }
    }

}