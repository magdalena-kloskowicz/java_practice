import java.time.LocalDate;

public class IsEqual {

  static Boolean isEqual (Person personArray, LocalDate firstDate) {
    return personArray.getDateOfBirth().isEqual(firstDate);
  }

}
