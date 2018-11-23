package Practice5.Generics.Task1;

public class Pair<T1, T2> {

    private T1 firstElement;
    private T2 secondElement;

    public Pair(T1 firstElement, T2 secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T1 getFirstElement() {
        return firstElement;
    }

    public T2 getSecondElement() {
        return secondElement;
    }
}
