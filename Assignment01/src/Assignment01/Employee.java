package Assignment01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private int id;
    private String employeeName;
    private byte gender;
    private String email;

    private String address;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String employeeName, byte gender, String email, String address, double salary) {
        this.id = id;
        this.employeeName = employeeName;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void input() {
        int n = 5, sum = 0, tempSort;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter id (number): ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("\nEnter name: ");
        employeeName = sc.nextLine();
        while(true) {
            System.out.println("\nEnter gender (1: male, 0: female): ");
            gender = sc.nextByte();
            sc.nextLine();
            if((gender == 0 || gender == 1)){
                break;
            }
        };
        Matcher matcher;
        do {
            System.out.println("\nEnter email (follow email format): ");
            email = sc.nextLine();
            String regex = "^[a-zA-Z]+[a-z\\d]*@\\w+mail.com$";
            Pattern pattern = Pattern.compile(regex);
            matcher = pattern.matcher(email);
        } while (!matcher.find());
        System.out.println("\nEnter address: ");
        address = sc.nextLine();
        System.out.println("\nEnter salary: ");
        salary = sc.nextDouble();
        System.out.println("-----------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + "], employeeName=" + employeeName + ", gender=" + gender + ", email=" + email
                + ", address=" + address + ", salary=" + salary + "]";
    }
}	
		
	
