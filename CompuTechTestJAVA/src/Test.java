public class Test {
    public static void main (String[] args){
        ClassOne objOne= new ClassTwo();
        System.out.println(objOne.variableOne);
       // A obj = new B(10);
        //obj.print();
       A obj = null ;
       obj.print();
       int[][] ss =new int[2][2];
        char String  ='i';
    }
}

class A{
//   A(int a){
//       System.out.println("a called");
//   }
    public static void print() {
        System.out.println("1");

    }
}
//class B extends A{
//    B(int b){
//        System.out.println("b called");
//    }
//    public static void print(){
//        System.out.println("2");
//    }
//}
class ClassOne{
    int variableOne=10;

}
class ClassTwo extends ClassOne{
    int variableOne=20;
}


