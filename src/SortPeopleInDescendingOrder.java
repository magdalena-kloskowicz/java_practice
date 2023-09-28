import java.util.Comparator;
import java.util.List;

public class SortPeopleInDescendingOrder {

  static List<Person> sortPeopleInDescendingOrder(List<Person> people) {
    people.sort(Comparator.comparing(Person::getDateOfBirth).reversed());
    return people;
  }

}
