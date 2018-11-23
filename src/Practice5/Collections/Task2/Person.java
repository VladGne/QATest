package Practice5.Collections.Task2;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
        this.name = "Name";
        this.age = 1;
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

        return  Integer.compare(this.age, person.age);
    }

    //public int compare(Person person1, Person person2) {
    //    return  person1.getName().compareTo(person2.getName());
    //}

    public static List<Person> unique(List<Person> people){
        ArrayList<Person> uniqueList = new ArrayList<Person>();
        SortedSet<Person> sortedSet = new TreeSet<Person>();
        sortedSet.addAll(people);

        for(Person person : sortedSet){
            if(!uniqueList.contains(person))
                uniqueList.add(person);
        }

        return uniqueList;
    }

    public boolean isEquals(List<Person> list1, List<Person> list2){
        if (list1.size() != list2.size())
            return false;
        else {
            for (int i =0; i<list1.size(); i++){
                if (!list1.get(i).getName().equals(list2.get(i).getName()) && !(list1.get(i).getAge() == (list2.get(i).getAge())))
                    return false;
            }
        }
        return true;
    }

    public static void compare(Person[] people){
        Arrays.sort(people, new Comparator<Person>(){
            @Override
            public int compare(Person person1, Person person2) {
                if (person1.getName().compareTo(person2.getName())==0)
                    return  person1.compareTo(person2);
                else
                    return  person1.getName().compareTo(person2.getName());
            }
        });
    }


}