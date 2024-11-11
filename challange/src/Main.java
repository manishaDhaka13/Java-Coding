import java.util.ArrayList;

public class Main {
}
//import java.util.ArrayList;
 class Bank {
    // write code here
    private String name;
    private ArrayList<Branch> branches ;
    public Bank(String name){
        this.name=name;
        this.branches = new ArrayList<>();
    }
    public boolean addBranch(String name){
        if(findBranch(name)==null){
            Branch br = new Branch(name);
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName ,String customerName, double initialTransaction){
        if(findBranch(branchName)==null){
            return false;
        }
        else{
            Branch b = findBranch(branchName);
            return b.newCustomer(name,initialTransaction);

        }
    }

    public boolean addCustomerTransaction(String branchName,String customerName,double transaction){

        if(findBranch(branchName)==null){
            return false;
        }
        else{
            Branch b = findBranch(branchName);
            return b.addCustomerTransaction(name,transaction);

        }

    }

    private Branch findBranch(String branchName){
        for(var branch :branches){
            if(branch.getName().equalsIgnoreCase(branchName)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomer(String branchName,boolean printTransaction){
        if(findBranch(branchName)==null){
            return false;
        }
        else{
            Branch b = findBranch(branchName);
            System.out.println("Customer details for baranch "+branchName);
            int i=1;
            if(printTransaction){
                for(var c : b.getCustomers()){
                    System.out.println("Customer: "+c.getName()+"["+i+"]");
                    System.out.println("Transactions");
                    int j=1;
                    for(var t : c.getTransactions()){
                        System.out.println("["+j+"] "+"Amount "+t);
                        j++;
                    }
                    i++;
                }
                return true;
            }
            else{
                for(var c : b.getCustomers()){
                    System.out.println("Customer: "+c.getName()+"["+i+"]");
                    i++;

                }
                return false;
            }
        }
    }
}

//import java.util.ArrayList;
 class Branch {
    // write code here
    private String name;
    private ArrayList<Customer> customers ;
    public Branch(String name){
        this.name=name;
        customers = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction){
        if(findCustomer(name)==null){
            Customer cust = new Customer(name);
            cust.addTransaction(initialTransaction);
            customers.add(cust);
            return true;
        }
        return false;


    }

    public boolean addCustomerTransaction(String name,double transaction){
        if(findCustomer(name)==null){
            return false;
        }
        Customer c = findCustomer(name);
        c.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name){
        for(var c:customers){
            if(c.getName().equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;

    }
}

//import java.util.ArrayList;
 class Customer {
    // write code here
    private String name;
    private ArrayList<Double> transactions ;
    public Customer(String name){
        this.name=name;
        transactions = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public ArrayList<Double> getTransactions(){
        return transactions;
    }
    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
}
