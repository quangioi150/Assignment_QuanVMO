package fa.training.main;

import fa.training.entities.Person;
import fa.training.entities.Student;
import fa.training.entities.Teacher;
import fa.training.services.PersonService;
import fa.training.services.StudentService;
import fa.training.services.TeacherService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonManage {

    public static void main(String[] arg) {
       PersonService service = new PersonService();
        Person[] persons = new Person[2];
        int chon;
        do {
            System.out.println("======CHƯƠNG TRÌNH QUẢN LÝ=======");
            System.out.println("Danh mục các thao tác quản lý:");
            System.out.println("1. Create Person");
            System.out.println("2. Update Student");
            System.out.println("3. Salary teacher");
            System.out.println("4. Display Student finalMark >=6: ");
            System.out.println("\t 0. Thoát chương trình");
            System.out.println("Chon:");
            chon = service.checkInPut();

            switch (chon) {
                case 1:
                    createPerson();
                    break;
                case 2:
                   updateStudent();
                    break;
                case 3:
                   salaryTeacher();
                    break;
                case 4:
                    displayStudent();
                case 0:
                    System.out.println("Quay lại!");
                    break;
                default:
                    System.out.println("Chọn thao tác không hợp lệ.");
            }
        } while (chon != 0);
    }

    public static void createPerson() {
        PersonService service = new PersonService();
        Person[] persons = new Person[2];
        System.out.println("1. Create Person");
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Enter person[" + (i + 1) + "]:");
            service.input();
        }
    }

    public static void updateStudent() {
        StudentService service1 = new StudentService();
        List<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("2. Update Student");
        //  System.out.println("4. Display Student finalMark >=6: ");
        System.out.println("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i <= n; i++) {
            System.out.println("Enter student[" + (i + 1) + "]:");
            service1.input();
        }
        service1.display(students);
    }

    public static void salaryTeacher() {
        TeacherService service2 = new TeacherService();

        List<Teacher> teachers = new ArrayList<Teacher>();
        System.out.println("3. Salary teacher");
        for (int i = 0; i <= teachers.size(); i++) {
            System.out.println("Enter teacher[" + (i + 1) + "]:");
            service2.input();
        }
        service2.sortTeacher(teachers);
    }

    public static void displayStudent() {
        StudentService service1 = new StudentService();
        List<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("4. Display Student finalMark >=6: ");
        System.out.println("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i <= n; i++) {
            service1.display(students);
        }
    }
}
