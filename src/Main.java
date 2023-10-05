import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Person> people = new ArrayList<>();
    people.add(new Person("John", LocalDate.parse("1969-03-15"), "+447984356766", "john@example.com"));
    people.add(new Person("Jane", LocalDate.parse("1998-04-09"), "+447220512328", "jane@example.com"));
    people.add(new Person("Harry",LocalDate.parse("1980-09-25"), "+447220012555", "harry@example.com"));
    people.add(new Person("Anne", LocalDate.parse("1978-01-12"), "+447220012222", "anne@example.com"));
    people.add(new Person("Jack", LocalDate.parse("1996-08-20"), "+447220012098", "jack@example.com"));

    LocalDate firstDate = LocalDate.parse("1980-01-01");

    people.forEach(i -> {
      if (WasBornAfter.wasBornAfter(i, firstDate)) {
        System.out.println(i.getName());
      }});

    SortPeopleByDateOfBirth.sortPeopleByDateOfBirth(people);

    people.forEach(person -> {
        System.out.println(person.getName() + " " + person.getDateOfBirth());
 });

    SortPeopleByDateOfBirth.sortPeopleInDescendingOrder(people);

    people.forEach(person -> {
      System.out.println(person.getName() + " " + person.getDateOfBirth());
    });

    SortPeopleByDateOfBirth.searchAndPrintPerson(people, "jack@example.com", "+447220012098");
 }

}







