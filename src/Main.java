import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {

    Person a = new Person("John", LocalDate.parse("1969-03-15"), "+447984356766", "john@gmail.com");
    Person b = new Person("Jane", LocalDate.parse("1998-04-09"), "+447220512328", "jane@gmail.com");
    Person c = new Person("Harry", LocalDate.parse("1980-09-25"), "+447220012555", "harry@gmail.com");
    Person d = new Person("Anne", LocalDate.parse("1978-01-12"), "+447220012222", "anne@gmail.com");
    Person e = new Person("Jack", LocalDate.parse("1996-08-20"), "+447220012098", "jack@gmail.com");

    Person[] personArray = new Person[5];
    personArray[0] = a;
    personArray[1] = b;
    personArray[2] = c;
    personArray[3] = d;
    personArray[4] = e;

    for (int i = 0; i < personArray.length; i++) {
      System.out.println(personArray[i]);
    }

  }
}