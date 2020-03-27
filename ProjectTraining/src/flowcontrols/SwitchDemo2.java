package flowcontrols;

import java.util.Scanner;

public class SwitchDemo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("|      Games List         |");
        System.out.println("----------------------------");
        System.out.println("|   1. Cricket            |");
        System.out.println("|   2. Coco               |");
        System.out.println("|   3. Running            |");
        System.out.println("|   4. Exit               |");
        System.out.println("---------------------------");
        System.out.println("Enter Your choice ?");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("12 player's required");
                break;
            case 2:
                System.out.println("10 player's required");
                break;
            case 3:
                System.out.println("Any Number of Players");
                break;
            case 4:
                System.out.println("All Games Closed");
                break;
            default:
                System.out.println("Please select your choice range 1-4 only");

        }
    }
}
