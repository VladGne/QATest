package Practice5.Collections.Task2;

public class Person implements Comparable{
    private String name;
    private int age;

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
    public int compareTo(Object o) {

       Person p = (Person) o;

       if (this.age == p.age)
           return 0;
       else if (this.age > p.age)
           return 1;
       else
           return -1;
    }

    public int compare(Person person1, Person person2) {
        return  person1.getName().compareTo(person2.getName());
    }

    //public List<Person> unique(List<Person> people){    }
}
