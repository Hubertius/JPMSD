import java.util.ArrayList;

public class Bank {
    // write code here
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String nameOfBranch) {
        if(findBranch(nameOfBranch) == null) {
            this.branches.add(new Branch(nameOfBranch));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initValue) {
        Branch branch = findBranch(nameOfBranch);
        if(branch != null) {
            boolean isAdded = branch.newCustomer(nameOfCustomer, initValue);
            return isAdded;
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double initValue) {
        Branch branch = findBranch(nameOfBranch);
        if(branch != null) {
            boolean isAdded = branch.addCustomerTransaction(nameOfCustomer, initValue);
            return isAdded;
        }
        return false;
    }

    private Branch findBranch(String nameOfBranch) {
        for(Branch branch: this.branches) {
            if(branch.getName().equals(nameOfBranch)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {

        Branch branch = findBranch(nameOfBranch);
        if(branch == null) {
            return false;
        }
        System.out.println("Customer details for branch " + nameOfBranch);
        int i = 1;
        for(Customer customer: branch.getCustomers()) {
            System.out.println("Customer: " + customer.getName() + "[" + i + "]");
            if(printTransactions) {
                int j = 1;
                System.out.println("Transactions");
                for(Double transaction: customer.getTransactions()) {
                    System.out.println("[" + j + "]" + " Amount " + transaction);
                    j++;
                }
            }
            i++;
        }
        return true;
    }
}