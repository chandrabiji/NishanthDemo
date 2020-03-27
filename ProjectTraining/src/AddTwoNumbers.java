import java.util.Scanner;

public class AddTwoNumbers {
    //instance methods
    public int add(int i, int j)
    {
        return i+j;
    }
    //static method
    public static int sub(int i, int j)
    {
        return i-j;
    }
    //final method
    public final void m1()
    {
        System.out.println("From final method");
    }
    //abstract method
    //public abstract  void m2();
    //synchronized method
    public synchronized  void m3()
    {
        System.out.println("From synchronized method");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddTwoNumbers obj = new AddTwoNumbers();//instance or object
        System.out.println("Enter A value ?");
        int a = sc.nextInt();
        System.out.println("Enter B value ?");
        int b = sc.nextInt();
        int sum = obj.add(a,b);
        int sub = sub(a,b);
        System.out.println("Sum = "+sum);
        System.out.println("Sub = "+sub);
    }
}
