package ObjectBasic.Task1;

public class Author {
    private String fistName;
    private String lastName;

    public Author(String fistName, String lastName){
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void printFullName(Author author){
      System.out.println(String.format("Author full name is: %s %s.", author.fistName, author.lastName));
    }
}
