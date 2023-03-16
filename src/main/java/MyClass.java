public class MyClass {
  private String firstName;
  private String lastName;

  MyClass(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String fullName() {
    return new StringBuilder().append(firstName).append(" ").append(lastName).toString();
  }
}
