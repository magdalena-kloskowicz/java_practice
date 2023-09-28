import java.util.Comparator;
import java.util.List;

public class SortPeopleByDateOfBirth {

  static List<Person> sortPeopleByDateOfBirth(List<Person> people) {

    people.sort(Comparator.comparing(Person::getDateOfBirth));
    return people;
  }
  static List<Person> sortPeopleInDescendingOrder(List<Person> people) {
    people.sort(Comparator.comparing(Person::getDateOfBirth).reversed());
    return people;
  }
}




