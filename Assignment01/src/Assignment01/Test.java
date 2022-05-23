package Assignment01;

public class Test {
    public static void main(String[] args) {
        Employee array[] = new Employee[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("- Enter employee["+ i+1 + "]:");
            Employee employee = new Employee();
            employee.input();
            array[i] = employee;
        }

        for (Employee employee : array) {
            if(employee.getSalary() >= 1000){
                System.out.println(employee);
            }
        }
    }
}
