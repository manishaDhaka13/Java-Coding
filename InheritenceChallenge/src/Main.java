public class Main {
    public static void main(String[] args){
        Employee tim= new Employee("tim","11/11/1985","1/1/2020");
        System.out.println(tim);
        System.out.println("Age = "+ tim.getAge());
        System.out.println(" pay = "+tim.collectPay());
        SalariedEmployee joe= new SalariedEmployee("joe","11/11/1985","1/1/2021",20000.0);
        System.out.println(joe);
        System.out.println("Age = "+ joe.getAge());
        System.out.println(" pay = "+joe.collectPay());
        joe.retire();
        System.out.println(" pay = "+joe.collectPay());
        HourlyEmployee marry= new HourlyEmployee("marry","11/11/1985","1/1/2021",200.0);
        System.out.println("pay "+ marry.collectPay());
        System.out.println(" double pay "+ marry.getDoublePay());
        System.out.println("\n");// new line escape charecter
        //System.out.println(\n); will give a error
        //System.out.println(\u2022); will give a error
        System.out.println("\u2022"); // print the unicode symbol
        System.out.println("fsgfdfg");
    }
}

class Worker{
    private String name;
    private String birthDate;
    protected String endDate;


    public Worker(){

    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear=2025;
        int birthYear=Integer.parseInt(birthDate.substring(6));
                                // substring is a method of string class that extract the string start from index
                               // birthDate is dd/mm/yyyy year start form index =6 the birthDate start from index =0
        return (currentYear-birthYear);
    }

    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate ){
        this.endDate=endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
class Employee extends Worker{
 private long employeeId;
 private String hireDate;
 private static  int employeeNo=1;
 public Employee(){

 }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
      }

      public double collectPay(){
        double paycheck=annualSalary/26;
        double adjustPay=(isRetired)?.9*paycheck:paycheck;
        return adjustPay;

      }

    public void retire(){
       terminate("12/12/2025");
       isRetired=true;

    }

}
class HourlyEmployee extends Employee{
     private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }
    public double collectPay(){
        double pay=40*hourlyPayRate;
        return pay;
    }
    public double getDoublePay(){
        return 2*collectPay();
     }
}
