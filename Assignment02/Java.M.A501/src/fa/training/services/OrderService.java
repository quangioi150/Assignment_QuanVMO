package fa.training.services;

import fa.training.entities.Customer;
import fa.training.entities.Order;
import fa.training.utils.DateUtil;

import java.util.List;
import java.util.Scanner;

public class OrderService {
    public Order createOrders(){
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        System.out.println("Enter Number: ");
        order.setNumber(scanner.nextLine());

        System.out.println("Enter date: ");
        String date = scanner.nextLine();
        order.setDate(DateUtil.convertStringToDate(date));

        return order;
    }
}
