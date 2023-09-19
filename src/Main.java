import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List <Person> people = new ArrayList<>();
    people.add(new Person("John", LocalDate.parse("1969-03-15"), "+447984356766", "john@gmail.com"));
    people.add(new Person("Jane", LocalDate.parse("1998-04-09"), "+447220512328", "jane@gmail.com"));
    people.add(new Person("Harry", LocalDate.parse("1980-09-25"), "+447220012555", "harry@gmail.com"));
    people.add(new Person("Anne", LocalDate.parse("1969-03-15"), "+447220012222", "anne@gmail.com"));
    people.add(new Person("Jack", LocalDate.parse("1996-08-20"), "+447220012098", "jack@gmail.com"));



  LocalDate firstDate = LocalDate.parse("1980-01-01");

   for (Person i : people) {
     if (WasBornAfter.wasBornAfter(i, firstDate)) {
      System.out.println(i.getName());
     }}}}

