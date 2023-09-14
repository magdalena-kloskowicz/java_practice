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


  public String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  private void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public String getEmail() {
    return email;
  }

  private void setEmail(String email) {
    this.email = email;
  }

  public String toString() {
    return "Name: " + this.name + ".\n"
        + "DOB: " + this.dateOfBirth + ".\n"
        + "Mobile: " + this.mobileNumber + ".\n"
        + "Email: " + this.email + ".\n";
  }}