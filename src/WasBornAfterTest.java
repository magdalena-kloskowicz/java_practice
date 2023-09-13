import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import java.lang.String;

class WasBornAfterTest {

  @Test
  void should_ReturnTrue_When_Person_WasBornAfter() {

      //given
      Person personArray = new Person();

    LocalDate firstDate = LocalDate.parse("1980-01-01");

      //when
      boolean isAfter = WasBornAfter.wasBornAfter(personArray,firstDate);

      //then
      assertTrue(isAfter);
    }

  @Test
  void should_ReturnFalse_When_Person_WasBornAfter() {

    //given
    Person personArray = new Person(String name, LocalDate dateOfBirth, String mobileNumber, String email);


    LocalDate firstDate = LocalDate.parse("1980-01-01");

    //when
    boolean isAfter = WasBornAfter.wasBornAfter(personArray,firstDate);

    //then
    assertFalse(isAfter);
  }

  @Test
  void should_ReturnTrue_When_PersonDateOfBirth_IsEqual() {

    //given
    Person personArray = new Person(String name, LocalDate dateOfBirth, String mobileNumber, String email);


    LocalDate firstDate = LocalDate.parse("1980-01-01");

    //when
    boolean isEqual = IsEqual.isEqual(personArray,firstDate);

    //then
    assertTrue(isEqual);
  }}



