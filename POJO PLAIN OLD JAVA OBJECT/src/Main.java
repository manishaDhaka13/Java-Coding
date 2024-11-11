public class Main {
   public static void main(String[] args){
       for(int i=1; i<=5; i++){
           Student s= new Student("456138"+i, switch(i){
               case 1->"mary";
               case 2-> "simran";
               case 3-> "aush";
               case 4-> "seema";
               case 5->"tina";
               default-> "anomynous";
           },"13/8/1985","a");
           System.out.println(s);  // if we write like this then implicitly s.toString() is called inside println statement
                                    //toString() is a Object class method that return className with hashcode (hashcode is like an address)
                                    //toString method this statement print like Student@214c265e (address)
                                     // Object is a root class of every class
                                    // if we override toString method in our Student class using code generator then this statement print the object with field value
                                   // print Student{id='4561381', name='mary', dateOfBirth='13/8/1985', classList='a'}
                                   // without overriding toString method this statement print like Student@214c265e (address)
       }

       Student PojoStudent=new Student("123456","yuvi","8/3/1945","cfdff");

       LPAStudent recordStudent=new LPAStudent("456789","mani","25/8/1995","java");

       System.out.println(recordStudent);
   // LPAStudent[id=456789, name=mani, dateOfBirth=25/8/1995, classList=java]
       System.out.println(PojoStudent);
       //Student{id='123456', name='yuvi', dateOfBirth='8/3/1945', classList='cfdff'}
      System.out.println(recordStudent.id());   //456789
      System.out.println(PojoStudent.getId());     //123456
      PojoStudent.setId("4578");
      System.out.println(PojoStudent.getId());  //4578
      // error recordStudent.setId("4785");
     // error  recordStudent.Id("78");
       // can't change the value of record after creating it

   }
}
