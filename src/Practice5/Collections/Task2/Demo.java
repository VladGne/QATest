package Practice5.Collections.Task2;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String args[]){

        Person[] people = new Person[10];
        people[0] = new Person();
        people[1] = new Person();
        people[2] = new Person();
        people[3] = new Person("Adam", 21);
        people[4] = new Person("Eve", 19);
        people[5] = new Person("Demiurge", 3761);
        people[6] = new Person("Bot1", 10);
        people[7] = new Person("Bot2", 7);
        people[8] = new Person("AgressiveBot", 2);
        people[9] = new Person("BrokenBot", 3);

        Person[] people1 = people;

        System.out.println("initializing:");
        for (Person person : people)
            System.out.println(person.getName() + ' ' + person.getAge());


        System.out.println("\nAfter compare sort:");
        for (Person person : people)
            System.out.println(person.getName() + ' ' + person.getAge());

        List<Person> personList = Person.unique(Arrays.asList(people));

        System.out.println("\nUnique list:");
        for (Person person : personList)
            System.out.println(person.getName() + ' ' + person.getAge());

        System.out.println(Person.isEquals(Arrays.asList(people), personList));
        System.out.println(Person.isEquals(personList, personList));
    }
}
