package fa.training.services;
import fa.training.entities.Student;
import fa.training.utils.Validator;

import java.util.List;
import java.util.Scanner;

public class StudentService {
public Student input(){
   boolean status;
    Scanner scanner = new Scanner(System.in);
    Student hs = new Student();
        System.out.println("Enter fullName: ");
        hs.setFullName(scanner.nextLine());

        System.out.println("Enter gender: ");
        hs.setGender(scanner.nextLine());

        System.out.println("Enter phoneNumber: ");
        hs.setPhone(scanner.nextLine());
        do {
            status = false;
            System.out.println("Enter email: ");
            hs.setEmail(scanner.nextLine());
            if (Validator.validEmail(hs.getEmail())) {
                status = false;
            } else {
                status = true;
            }
        } while (status);
        System.out.println("Enter StudentID: ");
        hs.setStudentId(scanner.nextLine());
        System.out.println("Enter Theory:");
        hs.setTheory(scanner.nextDouble());
        System.out.println("Enter Practice:");
        hs.setPractice(scanner.nextDouble());
    return hs;
}
public void display(List<Student> students) {
        for (Student hs : students) {
            if (hs.calculateFinalMark() >= 6) {
                System.out.println(hs);
            }
        }
}
}
