package fa.training.entities;

public class Teacher extends Person {
    private double basicSalary;
    private double subsidy;

    public Teacher(String fullName, String gender, String phone, String email, double basicSalary, double subsidy) {
        super(fullName, gender, phone, email);
        this.basicSalary = basicSalary;
        this.subsidy = subsidy;
    }

    public Teacher(){

    }
    public Teacher(double basicSalary, double subsidy) {
        this.basicSalary = basicSalary;
        this.subsidy = subsidy;
    }

    public double calculateSalary(){
        double salary=basicSalary+ subsidy;
        return salary;
    }
    public double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double getSubsidy() {
        return subsidy;
    }
    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }
}