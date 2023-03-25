package rest_assured_practice.User;

public class User {
    public String email;
    public String firstName;
    public String lastName;
    public Integer age;

    public Address address;


    // Getter Methods

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    // Setter Methods

    public void setEmail(String Email) {
        this.email = Email;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    public void setAge(Integer Age) {
        this.age = Age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
