public class Main {
   public static void main(String[] args){
       Account account = new Account();
       //System.out.println(account.getAccountBalance());   default value

       account.setAccountBalance(5000);
       account.setAccountNumber(4567890);
       account.setCustomerEmail("gsedfsdgsdf");
       account.setCustomerName("mani");
       account.setPhoneNumber(78945610);
       account.deposit(500);
       System.out.println("total balance is " + account.getAccountBalance());
       account.withdraw(7000);


       //using constructor
       // when we create a object using new keyword than constructor is automatically  called of that class
       // when we don't add a constructor than java implicitly add a default constructor
       // if we add a constructor then java does not add;

       Account bobAccount = new Account();
       Account nehalAccount= new Account(456789,456.5,"dgdsgfsdg","dfsdgds",4656123);
       System.out.println(nehalAccount.getAccountBalance());
       System.out.println("bob balance = "+bobAccount.getAccountBalance());


   }
}
