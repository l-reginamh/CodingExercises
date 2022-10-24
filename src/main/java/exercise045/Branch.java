package exercise045;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer == null) {
            Customer newCustomer = new Customer(name, transaction);
            this.customers.add(newCustomer);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTransaction(transaction);
            return true;
        }
        else {
            return false;
        }
    }

    private Customer findCustomer(String name) {
        for (Customer customer : this.customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}
