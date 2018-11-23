package Practice5.Collections.Task3;

import java.util.Arrays;

public class MyLinkedList<T> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyLinkedList(){
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // add en element
    public void add(T element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    // remove an element
    public T remove(int elementIndex) {
        if (elementIndex >= size || elementIndex < 0) {
            throw new IndexOutOfBoundsException("Index: " + elementIndex + ", Size: " + size);
        }
        Object item = elements[elementIndex];
        int numberOfElements = elements.length - ( elementIndex + 1 ) ;
        System.arraycopy( elements, elementIndex + 1, elements, elementIndex, numberOfElements ) ;
        size--;
        return (T) item;
    }

    // reverse elements
    public  void revese(){

       for(int i = 0; i < size / 2; i++)
        {
            Object temp = elements[i];
            elements[i] = elements[size - i - 1];
            elements[size - i - 1] = temp;
        }
    }

    public void printAll(){
        for(int i = 0; i < size ; i++)
            System.out.println(elements[i]);
    }

    class Iterator{

        int iterator;

        public Iterator() {
            this.iterator = 0;
        }

        public boolean hasNext(){
            return  iterator + 1 < size;
        }

        public void next(){
            iterator++;
        }

        public T remove(int elementIndex){
            return MyLinkedList.this.remove(elementIndex);
        }
    }

    class Node{
        T data;
        T nextNode;

        public Node(T data){

        }
    }

}