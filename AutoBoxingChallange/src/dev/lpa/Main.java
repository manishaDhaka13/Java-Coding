package dev.lpa;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Bank bank = new Bank("SBI");
        Customer c= new Customer("manisha",1255.5);
        System.out.println(c);
        bank.addCustomer(c);
        bank.addAnTransaction(c,125);
        bank.addAnTransaction(c,-250);
        System.out.println(bank);
        bank.printDetails("manisha");
    }
}



 class Bank {
    private String name;
    private ArrayList<Customer> customerArrayList ;
    public Bank(String name){
        this.name=name;
        customerArrayList = new ArrayList<>(5000);
    }

//    public String getName(){
//        return name;
//    }
//    public ArrayList<Customer> getCustomerArrayList(){
//        return customerArrayList;
//    }

    public Customer getCustomer(String customerName){
        for(var c :customerArrayList){
            if(c.name().equalsIgnoreCase(customerName)){
                return c;
            }
        }
        System.out.println("the customer was not found");
        return null;
    }

    public  void addCustomer(Customer customer){
        if(customerArrayList.contains(customer)){
            System.out.println("already in List");
        }
        else{
            customerArrayList.add(customer);
        }
    }
    public void addCustomer(String name, double ammount){
        if(getCustomer(name)==null){
            Customer c = new Customer(name,ammount);
            customerArrayList.add(c);
        }
        else{
            System.out.println("Customer already exist");
        }
    }
    public  void addAnTransaction(Customer c , double transaction){
        if(customerArrayList.contains(c)){
           // c.getTransactionList().add(transaction);
            c.transaction().add(transaction);
        }
        else{
            System.out.println("Customer does not exist" );
        }
    }

//    public void printDetails(ArrayList<Customer> cArrayList){
//        for(var c : cArrayList){
//            System.out.println("the name of customer is = "+c.name());
//            System.out.println("and the transaction are "+c.transaction());
//        }
//    }
    public void printDetails(String name){
        if(getCustomer(name)==null){
            System.out.println("customer does not exist");

        }
        else{
            Customer c = getCustomer(name);
            System.out.println("-".repeat(30));
            System.out.println("customer name : "+c.name());
            System.out.println("transaction: ");
            for(double d:c.transaction()) {  // unboxing
                System.out.printf("$%10.2f (%s)%n", d,(d<0)?"debit":"credit");
            }
            }
    }
}

//class Customer{
//
//    private String name;
//    private ArrayList<Double> transactionList ;
//    public Customer(String name){
//        this.name= name;
//        transactionList = new ArrayList<>();
//    }
//    public String getName(){
//        return name;
//    }
//    public ArrayList<Double> getTransactionList(){
//        return transactionList;
//    }
//
//}

record Customer(String name,ArrayList<Double> transaction){
    public Customer(String name, double initialDeposit){
        //to overloading the Constructor in record // overloading different signature we have to call default constructor
        // in first line
        this(name.toUpperCase(),new ArrayList<Double>(500));
        transaction.add(initialDeposit);
    }
}