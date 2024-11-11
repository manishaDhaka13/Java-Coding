public class Main {

    public static void main(String[] args){
        Customer customer=new Customer("tim",50000,"gdsfdf");
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        Customer customer1=new Customer(50000,"gdsfdf");
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getName());
        System.out.println(customer1.getEmail());
        Customer customer2= new Customer();
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmail());
    }
}
