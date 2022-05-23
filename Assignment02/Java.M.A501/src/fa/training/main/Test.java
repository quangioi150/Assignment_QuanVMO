package fa.training.main;

import fa.training.services.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] arg) {
        CustomerService service = new CustomerService();
        List<String> customers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String phone = null;
        System.out.println("Enter Customer: ");
        System.out.println("Nhap so Customer: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i <= n; i++) {
            System.out.println("Enter customer[" + (i + 1) + "]: ");
            service.createCustomers();
        }
          service.save(customers);
            service.findAll(customers);
            service.display(customers);
            service.search(phone);
            service.remove(phone);
            service.display(customers);

    }
}
