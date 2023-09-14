import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.Test;
import java.lang.String;

class WasBornAfterTest {

  @Test
  void should_ReturnTrue_When_Person_WasBornAfter() {

    //given
    Person b = getPerson("Jane", "1998-04-09");
    Person c = getPerson("Harry", "1980-09-25");
    Person e = getPerson("Jack", "1996-08-20");


    List<Person> personList = List.of(b, c, e);

    LocalDate firstDate = LocalDate.parse("1980-01-01");

    for (Person i : personList) {
      System.out.println("Person " + i.getName() + " was born after " + firstDate + " is: " +WasBornAfter.wasBornAfter(i, firstDate));
    }


    //then
    assertTrue(WasBornAfter.wasBornAfter(b, firstDate));
    assertTrue(WasBornAfter.wasBornAfter(c, firstDate));
    assertTrue(WasBornAfter.wasBornAfter(e, firstDate));


  }

  private Person getPerson(String name) {
    LocalDate dateOfBirth = LocalDate.parse("1980-01-01");
    String mobile = "077770123456";
    String email = name + "@test.com";
    return new Person(name, dateOfBirth, mobile, email);
  }

  private Person getPerson(String name, String dob) {
    LocalDate dateOfBirth = LocalDate.parse(dob);
    String mobile = "077770123456";
    String email = name + "@test.com";
    return new Person(name, dateOfBirth, mobile, email);
  }

    @Test
    void should_ReturnFalse_When_Person_WasBornAfter() {
      //given
      Person a = getPerson("John", "1969-03-15");
      Person d = getPerson("Anne", "1969-08-20");



      List<Person> personList = List.of(a,d);

      LocalDate firstDate = LocalDate.parse("1980-01-01");

      for (Person i : personList) {
        System.out.println("Person " + i.getName() + " was born after " + firstDate + " is: " +WasBornAfter.wasBornAfter(i, firstDate));
      }


      //then
      assertFalse(WasBornAfter.wasBornAfter(a, firstDate));
      assertFalse(WasBornAfter.wasBornAfter(d, firstDate));


    }

  @Test
  void should_ReturnTrue_When_PersonDateOfBirth_IsEqualTo() {

    //given (some data that is the required setup for a test run)
    Person a = getPerson("John");
    Person b = getPerson("Jane");
    Person c = getPerson("Harry");
    Person d = getPerson("Anne");
    Person e = getPerson("Jack");


    // When (we run some code with the given data)
    Person[] personArray = new Person[5];
    personArray[0] = a;
    personArray[1] = b;
    personArray[2] = c;
    personArray[3] = d;
    personArray[4] = e;

    a.setDateOfBirth(LocalDate.parse("1979-01-01"));
    b.setDateOfBirth(LocalDate.parse("1979-01-01"));
    c.setDateOfBirth(LocalDate.parse("1979-01-01"));
    d.setDateOfBirth(LocalDate.parse("1979-01-01"));
    e.setDateOfBirth(LocalDate.parse("1979-01-01"));


    //then (assert that results are as expected)
    assertThat(personArray).contains(a,b,c,d,e);
    assertThat(personArray[0].getDateOfBirth()).isEqualTo(LocalDate.parse("1979-01-01"));
    assertThat(personArray[1].getDateOfBirth()).isEqualTo(LocalDate.parse("1979-01-01"));


  }}



