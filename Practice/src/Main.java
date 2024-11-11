public class Main {
    public static void main(String[] argd){
        A aa = new A(10);

        System.out.println(aa.b);   //0 default value
    }
}
class A{
    int a;
    int b;
    A(int c){
        a=c;
        System.out.println(c);
    }
}
