import java.time.LocalDate;

public class WasBornAfter {


  static Boolean wasBornAfter(Person people, LocalDate firstDate) {
    return people.getDateOfBirth().isAfter(firstDate);
  }
}