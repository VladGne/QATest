package Practice5.Collections.Task2;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Person implements Comparable<Person>, Comparator<Person>{
    private String name;
    private int age;

    public Person() {
        this.name = "Name";
        this.age = 21;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(@NotNull Person person) {

        return  this.age - person.age;
    }

    public static List<Person> unique(List<Person> people){
        SortedSet<Person> sortedSet = new TreeSet<Person>(people);
        people.clear();
        for(Person person : sortedSet){
            if(!people.contains(person))
                people.add(person);
        }

        return people;
    }

    public static boolean isEquals(List<Person> list1, List<Person> list2){
        if (list1.size() != list2.size())
            return false;
        else {
            list1.sort(Person::compareTo);
            list2.sort(Person::compareTo);

            for (int i =0; i<list1.size(); i++){
                if (list1.get(i).equals(list2.get(i)))
                    return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compare(Person person1, Person person2) {
        int result = person1.getName().compareTo(person2.getName());
        return result !=0 ? result :  person1.compareTo(person2);
    }
}