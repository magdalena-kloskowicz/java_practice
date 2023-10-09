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

  static boolean searchAndPrintPerson(List<Person> people, String email, String mobileNumber) {
    for (Person person : people){
      if (person.getEmail().equals(email) || person.getMobileNumber().equals(mobileNumber)){
        System.out.println("Found person:\n"+ "Name: " + person.getName() + "\nDate of birth: " + person.getDateOfBirth());
        return true;
      }
    }
    return false;
  }
}




