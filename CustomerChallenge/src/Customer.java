public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }
    public Customer(){
        this("manish",5000000.789,"dfg@gsdfdsf");
        System.out.println("this is empty constructor");
    }
    public Customer(double creditLimit, String email){
        this("nisha",creditLimit,email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
