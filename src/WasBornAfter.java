import java.time.LocalDate;

public class WasBornAfter {


  static Boolean wasBornAfter(Person personArray, LocalDate firstDate) {
    return personArray.getDateOfBirth().isAfter(firstDate);
  }
}