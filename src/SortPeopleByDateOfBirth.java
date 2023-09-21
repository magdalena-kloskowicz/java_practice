import java.util.Comparator;
import java.util.List;

public class SortPeopleByDateOfBirth {

  static List<Person> sortPeopleByDateOfBirth(List<Person> people) {

    people.sort(Comparator.comparing(Person::getDateOfBirth));
    return people;
  }
}




