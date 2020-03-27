public class VariableTypes {

    int b = 20;//instance variables
    static int c = 30;//static variable
    final  int d = 40;//final variable
    volatile  int e = 50;//volatile variable
    transient int f = 60;//transient variable
    public static void main(String[] args) {
        VariableTypes obj = new VariableTypes();//instance or Object
        int a = 10;//local variable
        System.out.println("A = "+a);
        System.out.println("B = "+obj.b);
        System.out.println("C = "+c);
        System.out.println("D = "+obj.d);

    }
}
