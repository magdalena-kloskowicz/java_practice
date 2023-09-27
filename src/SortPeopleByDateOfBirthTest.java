import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

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

    // then
    List<Person> expected = List.of(
        getPerson("John", "1969-03-15"),
        getPerson("Anne", "1978-01-12"),
        getPerson("Harry","1980-09-25"),
        getPerson("Jack", "1996-08-20"),
        getPerson("Jane", "1998-04-09")
    );
    assertEquals(expected,sortedList);
    }
  private Person getPerson(String name, String dob){
    LocalDate dateOfBirth=LocalDate.parse(dob);
    String mobile="077770123456";
    String email=name+"@test.com";
    return new Person(name,dateOfBirth,mobile,email);
  };

    }


