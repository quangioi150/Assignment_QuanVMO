package fa.training.services;

import fa.training.entities.Person;
import fa.training.entities.Teacher;
import fa.training.utils.Validator;

import java.util.List;
import java.util.Scanner;
public class TeacherService {
    public Teacher input() {
        boolean status;

        Scanner scanner = new Scanner(System.in);
        Teacher tea = new Teacher();
        PersonService service = new PersonService();
        System.out.println("Enter fullName: ");
        tea.setFullName(scanner.nextLine());

        System.out.println("Enter gender: ");
        tea.setGender(scanner.nextLine());

        System.out.println("Enter phoneNumber: ");
        tea.setPhone(scanner.nextLine());
        do{
            status = false;
            System.out.println("Enter email: ");
            tea.setEmail(scanner.nextLine());
            if(Validator.validEmail(tea.getEmail())){
                status = false;
            }else {
                status = true;
            }
        } while(status);
        System.out.println("Enter basicSalary:");
        tea.getBasicSalary();
        scanner.nextLine();
        System.out.println("Enter subsidy: ");
        tea.getSubsidy();
        scanner.nextLine();
        return tea;
    }
    public void sortTeacher(List<Teacher> teachers) {
        for (Teacher tea : teachers) {
            if (tea.calculateSalary() >= 1000) {
                System.out.println(tea);
            }
        }
    }
}
