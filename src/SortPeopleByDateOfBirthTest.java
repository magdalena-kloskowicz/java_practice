import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class SortPeopleByDateOfBirthTest {
  @Test
  void should_ReturnPeopleSortedByDateOfBirth_When_SortPeopleByDateOfBirth() {

    //given
    List<Person> people = new ArrayList<>();
    people.add(new Person("John", LocalDate.parse("1969-03-15"), "+447984356766", "john@example.com"));
    people.add(new Person("Jane", LocalDate.parse("1998-04-09"), "+447220512328", "jane@example.com"));
    people.add(new Person("Harry",LocalDate.parse("1980-09-25"), "+447220012555", "harry@example.com"));
    people.add(new Person("Anne", LocalDate.parse("1978-01-12"), "+447220012222", "anne@example.com"));
    people.add(new Person("Jack", LocalDate.parse("1996-08-20"), "+447220012098", "jack@example.com"));

    //when
    List<Person> sortedList = SortPeopleByDateOfBirth.sortPeopleByDateOfBirth(people);

    List<LocalDate> actualDatesOfBirth = sortedList.stream()
        .map(Person::getDateOfBirth)
        .toList();

    // then
    List<LocalDate> expectedDatesOfBirth = List.of(
          LocalDate.parse("1969-03-15"),
          LocalDate.parse("1978-01-12"),
          LocalDate.parse("1980-09-25"),
          LocalDate.parse("1996-08-20"),
          LocalDate.parse("1998-04-09")
    );

    assertEquals(expectedDatesOfBirth,actualDatesOfBirth);

    }

  @Test
  void should_ReturnPeopleSortedByDateOfBirth_When_SortPeopleInDescendingOrder(){
    //given
    List<Person> people = new ArrayList<>();
    people.add(new Person("John", LocalDate.parse("1969-03-15"), "+447984356766", "john@example.com"));
    people.add(new Person("Jane", LocalDate.parse("1998-04-09"), "+447220512328", "jane@example.com"));
    people.add(new Person("Harry",LocalDate.parse("1980-09-25"), "+447220012555", "harry@example.com"));
    people.add(new Person("Anne", LocalDate.parse("1978-01-12"), "+447220012222", "anne@example.com"));
    people.add(new Person("Jack", LocalDate.parse("1996-08-20"), "+447220012098", "jack@example.com"));

    //when
    List<Person> sortedInDescendingOrder =SortPeopleByDateOfBirth.sortPeopleInDescendingOrder(people);

    List<LocalDate> actualDatesOfBirth = sortedInDescendingOrder.stream()
        .map(Person::getDateOfBirth)
        .toList();

    // then
    List<LocalDate> expectedDatesOfBirth = List.of(
        LocalDate.parse("1998-04-09"),
        LocalDate.parse("1996-08-20"),
        LocalDate.parse("1980-09-25"),
        LocalDate.parse("1978-01-12"),
        LocalDate.parse("1969-03-15")


    );

    assertEquals(expectedDatesOfBirth,actualDatesOfBirth);

  }

}


