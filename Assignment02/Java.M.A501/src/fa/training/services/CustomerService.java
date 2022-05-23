package fa.training.services;

import fa.training.entities.Customer;
import fa.training.entities.Order;
import fa.training.utils.Validator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomerService {

    private List<Customer> customers = new ArrayList<>();

    public List<Customer> createCustomers() {
        boolean status;
        String contiCus;
        String contiOr;
        Scanner scanner = new Scanner(System.in);

        do {
            Customer customer = new Customer();

            System.out.println("Enter Name: ");
            customer.setName(scanner.nextLine());

            System.out.println("Enter Address: ");
            customer.setAddress(scanner.nextLine());

            do {
                System.out.println("Enter Phone Number: ");
                customer.setPhoneNumber(scanner.nextLine());
                status = !Validator.validNumberPhone(customer.getPhoneNumber());
            } while (status);

            List<Order> orders = new ArrayList<>();
            do {
                OrderService orderService = new OrderService();
                Order order = orderService.createOrders();
                orders.add(order);
                System.out.println("Do you continue?(Y/N): ");
                contiOr = scanner.nextLine();
            } while (!contiOr.equals("n") && !contiOr.equals("N"));

            customer.setOrders(orders);
            customers.add(customer);
            System.out.println("Do you continue?(Y/N): ");
            contiCus = scanner.nextLine();
        } while (!contiCus.equals("n") && !contiCus.equals("N"));

        return customers;
    }

    public List<String> save(List<String> customers) {
        try {
            FileWriter fileWriter = new FileWriter("Customer.dat");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            // inputStream outputStream
            bufferedWriter.write(String.valueOf(customers));
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customers;
    }

    /**
     * Get all of customers
     *
     * @return List<String>
     */
    public List<String> findAll(List<String> customers) {
        return this.customers.stream().map(Object::toString).collect(Collectors.toList());
    }

    /**
     * display customer list in the following format
     */
    public void display(List<String> customers) {
        //System.out.println("Customer" + "\t\tAddress" + "\tPhone Number" + "\tOrderList");
        for (String cus : customers) {
            System.out.println(cus);
        }
    }

    /**
     * search order by customer
     *
     * @param phone String
     * @return List<String>
     */
    public List<String> search(String phone) {
        List<Order> orderSearchList = new ArrayList<>();
        List<String> s = new ArrayList<>();
        for (Customer cus : customers) {
            if (cus.getPhoneNumber().equals(phone)) {
                orderSearchList = cus.getOrders();
            }
        }
        for (Order or : orderSearchList) {
            s.add(or.toString());
        }
        return s;
    }

    public boolean remove(String phone) {
        List<Customer> customers = new ArrayList<>();
        if (customers.isEmpty()) {
            System.out.println("Sorry, Khong co phoneNumber can tim.");
        } else {

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the search keyword for or 0 to quit: ");
            String search = input.next().trim().toUpperCase();
            if (search.equals("0") == false) {
                boolean found = false;
                for (Customer a : customers) {
                    if (a.getPhoneNumber().toUpperCase().equals(search)) {
                        System.out.println("that contact info is: ");
                        System.out.println("phone number: " + a.getPhoneNumber());
                        found = true;
                        Scanner inp = new Scanner(System.in);
                        System.out.println("Are you sure you would like to remove this contact?");
                        String sure = inp.next().toUpperCase();
                        if (sure.equals("YES")) {
                            customers.remove(a);
                            System.out.println("Contact removed... ");
                     //       display(customers);
                        }
                    } else {
                        found = false;
                        System.out.println("Sorry, that contact can not be found!");
                    }
                }
            }
        }
        return true;
    }

}
