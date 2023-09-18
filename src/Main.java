import java.time.LocalDate;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Person a = new Person("John", LocalDate.parse("1969-03-15"), "+447984356766", "john@gmail.com");
    Person b = new Person("Jane", LocalDate.parse("1998-04-09"), "+447220512328", "jane@gmail.com");
    Person c = new Person("Harry", LocalDate.parse("1980-09-25"), "+447220012555", "harry@gmail.com");
    Person d = new Person("Anne", LocalDate.parse("1969-03-15"), "+447220012222", "anne@gmail.com");
    Person e = new Person("Jack", LocalDate.parse("1996-08-20"), "+447220012098", "jack@gmail.com");

    List <Person> people = List.of(a,b,c,d,e);


  LocalDate firstDate = LocalDate.parse("1980-01-01");

   for (Person i : people) {
     if (WasBornAfter.wasBornAfter(i, firstDate)) {
      System.out.println(i.getName());
     }}}}

