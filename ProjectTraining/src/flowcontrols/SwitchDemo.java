package flowcontrols;
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice Like 1,2,3?");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Please select your choice range 1-3 only");

        }
    }
}
