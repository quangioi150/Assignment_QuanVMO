package fa.training.entities;

import java.util.List;

public class Customer {
    private String name;
    private String phoneNumber;
    private String address;

    private List<Order> orders;

    public Customer() {
    }

    public Customer(String name, String phoneNumber, String address, List<Order> orders) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        if(orders.size() == 0){
            s.append(name).append("\t\t").append(address).append("\t").append(phoneNumber).append("phoneNumber");
            return s.toString();
        }
        for (Order order : orders) {
            s.append(name).append("\t\t").append(address).append("\t").append(phoneNumber).append("phoneNumber").append(order.getNumber());
        }
        return s.toString();
    }
}
