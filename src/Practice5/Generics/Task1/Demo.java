package Practice5.Generics.Task1;


import Practic3.Task1.Circle;

public class Demo {

    public static void main(String args[]){

        Pair<String, Circle> objectsPair = new Pair<String, Circle>("Simple Circle", new Circle());

        System.out.println("First: " + objectsPair.getFirstElement() + '\n' + "Second: " + objectsPair.getSecondElement() );
    }
}
