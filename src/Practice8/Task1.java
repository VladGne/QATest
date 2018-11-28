package Practice8;

import Practice5.Collections.Task2.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String args[]){

        List<Person> people = new ArrayList<>();
        people.add(new Person()); // Person: Name - Name, age - 21
        people.add(new Person());
        people.add(new Person());
        people.add(new Person("Adames", 21));
        people.add(new Person("Eve", 29));
        people.add(new Person("Demiurge", 27));
        people.add(new Person("Bot01", 19));
        people.add(new Person("Bot02", 30));
        people.add(new Person("AgressiveBot", 25));
        people.add(new Person("BrokenBot", 99999));

        List<String> personList = people.stream()
                .filter( person -> person.getAge()>=20 && person.getAge()<=30).distinct()
                .map( person -> person.getName().toUpperCase())
                .sorted(Comparator.comparingInt( String::length ))
                .collect(Collectors.toList());


        personList.forEach(System.out::println);
    }


}
