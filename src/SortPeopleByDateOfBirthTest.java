import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class SortPeopleByDateOfBirthTest {
  @Test
  void should_ReturnPeopleSortedByDateOfBirth_When_SortPeopleByDateOfBirth() {

    //given
    List<Person> people = new ArrayList<>();
    people.add(new Person("John", LocalDate.parse("1969-03-15"), "+447984356766", "john@gmail.com"));
    people.add(new Person("Jane", LocalDate.parse("1998-04-09"), "+447220512328", "jane@gmail.com"));
    people.add(new Person("Harry",LocalDate.parse("1980-09-25"), "+447220012555", "harry@gmail.com"));
    people.add(new Person("Anne", LocalDate.parse("1978-01-12"), "+447220012222", "anne@gmail.com"));
    people.add(new Person("Jack", LocalDate.parse("1996-08-20"), "+447220012098", "jack@gmail.com"));

    //when

  SortPeopleByDateOfBirth.sortPeopleByDateOfBirth(people);
    //then
}

  }


