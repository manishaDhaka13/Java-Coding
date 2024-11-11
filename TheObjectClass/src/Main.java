//public class Main  {// every class that not explicitly inherit from other class
//                    // implicitly extends Object class
//                   // Object is a base class or root class of every class(inheritence tree)
//                  // Object is a java.lang package class
//                  // java imlicitly load Object class in every java project
//                 // so we can access it like java.lang.Object or Object
//}

public class Main extends Object {
    public static void main(String[] args){
   Student max = new Student("MAx",21);
   System.out.println(max);       // Student@1b28cdfa without overriding toString method in Student (subclss) implicitly called max.toString()
   System.out.println(max.toString());  // with override Student{name='MAx', age=21} // we can also write only max because java internally called toString overriden methd in class
        PrimarySchoolStudent meena=new PrimarySchoolStudent("meena",12,"james");
        System.out.println(meena);
    }

}

// only one public class can be in src java file(single file)
// so if we include other class then it must be other than public(should be default accesser)
 class Student{  // it will implicitly inherit from  Object class
     private String name;
     private int age;
     Student(String name, int age){
         this.name=name;
         this.age=age;

     }

    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
        return name+ " is "+ age;
    }
}

class PrimarySchoolStudent extends Student{ // java only support one class in extends class
    private String parantName;
    PrimarySchoolStudent(String name, int age, String parantName){
        super(name, age);
        this.parantName=parantName;
    }

    @Override
    public String toString() {
        return parantName +"'s kid, "+ super.toString();
    }
}
