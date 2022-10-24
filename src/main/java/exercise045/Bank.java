package exercise045;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branch) {
        Branch thebranch = findBranch(branch);
        if (thebranch == null) {
            this.branches.add(new Branch(branch));
            return true;
        }
        else {
            return false;
        }
    }

    public boolean addCustomer(String branch, String customer, double transaction) {
        Branch thebranch = findBranch(branch);
        if (thebranch == null) {
            return false;
        }
        else {
            return thebranch.newCustomer(customer, transaction);
        }
    }

    public boolean addCustomerTransaction(String branch, String customer, double transaction) {
        Branch thebranch = findBranch(branch);
        if (thebranch == null) {
            return false;
        }
        else {
            return thebranch.addCustomerTransaction(customer, transaction);
        }
    }

    private Branch findBranch(String branch) {
        for (Branch thebranch : this.branches) {
            if (thebranch.getName().equals(branch) == true) {
                return thebranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branch, boolean transactions) {
        Branch thebranch = findBranch(branch);
        if (thebranch == null) {
            return false;
        }
        else {
            System.out.println("Customer details for branch " + branch);
            int i = 1;
            for (Customer customer: thebranch.getCustomers()) {
                System.out.println("Customer: " + customer.getName() + "[" + i + "]");
                if (transactions) {
                    System.out.println("Transactions");
                    int j = 1;
                    for (Double transaction: customer.getTransactions()) {
                        System.out.println("[" + j + "]" + "  Amount " + transaction);
                        j++;
                    }
                }
                i++;
            }
            return true;
        }
    }
}
