import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

class WasBornAfterTest {

  @Test
  void should_ReturnTrue_When_WasBornAfter() {

      //given
      Person personArray= new Person("Jane", LocalDate.parse("1998-04-09"), "+447220512328", "jane@gmail.com");
                          new Person("Harry", LocalDate.parse("1980-09-25"), "+447220012555", "harry@gmail.com");
                          new Person("Jack", LocalDate.parse("1996-08-20"), "+447220012098", "jack@gmail.com");

    LocalDate firstDate = LocalDate.parse("1980-01-01");

      //when
      boolean isAfter = WasBornAfter.wasBornAfter(personArray,firstDate);

      //then
      assertTrue(isAfter);
    }

  @Test
  void should_ReturnFalse_When_WasBornAfter() {

    //given
    Person personArray= new Person("John", LocalDate.parse("1969-03-15"), "+447984356766", "john@gmail.com");
                        new Person("Anne", LocalDate.parse("1978-01-12"), "+447220012222", "anne@gmail.com");

    LocalDate firstDate = LocalDate.parse("1980-01-01");

    //when
    boolean isAfter = WasBornAfter.wasBornAfter(personArray,firstDate);

    //then
    assertFalse(isAfter);
  }}

