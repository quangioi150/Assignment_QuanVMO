package fa.training.services;
import fa.training.entities.Person;
import fa.training.utils.Validator;
import java.util.Scanner;
public class PersonService {
    public Person input(){
        boolean status;
        Scanner scanner = new Scanner(System.in);
        Person per = new Person();
        System.out.println("Enter fullName: ");
        per.setFullName(scanner.nextLine());

            System.out.println("Enter gender: ");
            per.setGender(scanner.nextLine());

        System.out.println("Enter phoneNumber: ");
        per.setPhone(scanner.nextLine());
        do{
            status = false;
            System.out.println("Enter email: ");
            per.setEmail(scanner.nextLine());
            if(Validator.validEmail(per.getEmail())){
                status = false;
            }else {
                status = true;
            }
        } while(status);
        return per;
    }
    public int checkInPut() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int chon = 0;
        while (!flag) {
            try {
                chon = scanner.nextInt();
                scanner.nextLine();
                flag = true;
            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println("Chỉ nhập vào số!");
            }
        }
        return chon;
    }
}
