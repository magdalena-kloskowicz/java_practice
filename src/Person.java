import java.time.LocalDate;

public class Person {

  private String name; // Object's fields.
  private LocalDate dateOfBirth;
  private String mobileNumber;
  private String email;

  // Constructor's parameters.
  public Person(String name, LocalDate dateOfBirth, String mobileNumber, String email) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.mobileNumber = mobileNumber;
    this.email = email;
  };

  public String toString() {
    return "Name: " + this.name + ".\n"
        + "DOB: " + this.dateOfBirth + ".\n"
        + "Mobile: " + this.mobileNumber + ".\n"
        + "Email: " + this.email + ".\n";
  }
}