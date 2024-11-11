public class Account {



    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    // constructor have same name as class and does not return anything not even void return
    // constructor with no argument is called no args constructor
    // a class can have many constructor with same name but different argument

    public Account(){
        this(123456,78945,"mani","qwer",127836);
        // calling another constructor
        // this() must be first statement

        System.out.println("empty constructor is called");

    }

    // to call a constructor of a same class from another constructor we use this(argument) in constructor
    // this statement must be first statement of constructor
    // calling different constructor from a constructor is called chaining of constructor
    // we can only call constructor inside from another constructor
    // constructor overloading

    public Account (int accountNumber,double accountBalance, String customerName,String email, int number){
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.customerName=customerName;
        customerEmail=email;
        phoneNumber=number;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int number){
        accountNumber=number;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void deposit(double amt){
        accountBalance+=amt;
        System.out.println("your total balance is "+ amt);

    }
    public void withdraw(double amt){
        if(accountBalance-amt<0){
            System.out.println("you don't have enough balance");
            return ;
        }
        accountBalance-=amt;
    }

}
