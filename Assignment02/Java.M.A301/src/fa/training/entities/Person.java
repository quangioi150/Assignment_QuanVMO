package fa.training.entities;

public class Person {
    private String fullName;
    private String gender;
    private String phone;
    private String email;

    public Person(String fullName, String gender, String phone, String email) {
        this.fullName = fullName;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    public Person() {

    }

    public void purchaseParkingPass() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}