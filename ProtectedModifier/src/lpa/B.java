package lpa;

import dev.A;

public class B extends A {
    int c=10;
  public static void main(String[] args ){
      A a = new A();
      a.hello();
      //a.showMarks(); // this method is protected so only can call by subclass outside package
      B b = new B();
      b.showMarks();
      //c=30; non static can't call from static
  }
  
}
