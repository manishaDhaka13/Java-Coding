public class Main {
    public static void main(String [] args){

        System.out.println(new Doubt()) ;
    }
}

class Doubt{
  //  static final int x;
     //int y;
   // final int z;
    static{
       // x=10;
        System.out.println("hello");
    }
    {
        System.out.println("hi");
    }
    Doubt(){
        System.out.println("mi");
//     z=2;    // it's correct java does not default initailized final variable as 0 in constructor
//                    // but if we don't initialize final in instance or constructor then it will give error
//     y=2;
//        System.out.println(y);
    }
    void m1(){

    }
}

