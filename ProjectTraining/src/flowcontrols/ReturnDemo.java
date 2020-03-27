package flowcontrols;

public class ReturnDemo {

    public int add(int i,int j)
    {
        return i+j;
    }

    public static void main(String[] args) {
        ReturnDemo obj = new ReturnDemo();
        System.out.println("Result = "+obj.add(10,20));
    }
}
