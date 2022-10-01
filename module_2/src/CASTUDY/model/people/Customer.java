package CASTUDY.model.people;

public class Customer extends Person {
    private String iDNumber;
    private String typeOfGuest;
    private String address;

    public Customer() {
    }

    public Customer(String code, String name, String dateOfBirth, String sex, String phoneNumber, String email) {
        super(code, name, dateOfBirth, sex, phoneNumber, email);
    }

    public Customer(String iDNumber, String typeOfGuest, String address) {
        this.iDNumber = iDNumber;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public Customer(String code, String name, String dateOfBirth, String sex, String phoneNumber, String email, String iDNumber, String typeOfGuest, String address) {
        super(code, name, dateOfBirth, sex, phoneNumber, email);
        this.iDNumber = iDNumber;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString()+ "Customer{" +
                "iDNumber='" + iDNumber + '\'' +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
