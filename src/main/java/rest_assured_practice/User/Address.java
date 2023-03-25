package rest_assured_practice.User;

public class Address {
    public Integer flatNo;
    public String street;

    public Abc abc;

    public Abc getAbc() {
        return abc;
    }

    public void setAbc(Abc abc) {
        this.abc = abc;
    }

    // Getter Methods

    public Integer getFlatNo() {
        return flatNo;
    }

    public String getStreet() {
        return street;
    }

    // Setter Methods

    public void setFlatNo(Integer flatNo) {
        this.flatNo = flatNo;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
