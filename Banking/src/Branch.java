import java.util.ArrayList;

public class Branch {
    // write code here
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String nameOfCustomer, double transaction) {
        if(findCustomer(nameOfCustomer) !=  null) {
            return false;
        }
        Customer customer = new Customer(nameOfCustomer, transaction);
        this.customers.add(customer);
        return true;
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction) {
        if(findCustomer(nameOfCustomer) ==  null) {
            return false;
        }
        for(Customer customer: this.customers) {
            if(customer.getName().equals(nameOfCustomer)) {
                customer.addTransaction(transaction);
                return true;
            }
        }
        return false;
    }

    private Customer findCustomer(String nameOfCustomer) {
        for(Customer customer: this.customers) {
            if(customer.getName().equals(nameOfCustomer)) {
                return customer;
            }
        }
        return null;
    }

}