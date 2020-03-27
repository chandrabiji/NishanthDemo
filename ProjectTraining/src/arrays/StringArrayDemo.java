package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Array Size ?");
        int size = sc.nextInt();
        String[] names = new String[size];
        System.out.println("Enter String Array Elements : ");
        for(int i=0;i<size;++i)
        {
            names[i]=sc.next();
        }
        System.out.println("String Array Elements are :");
        for(String name:names)
        {
            System.out.println(name);
        }
        Arrays.sort(names);//Array Sorting
        System.out.println("String Array Elements after sorting");
        for(String name:names)
        {
            System.out.println(name);
        }
        System.out.println("Enter Search Name ?");
        String sname = sc.next();
        for(String name:names)
        {
            if(name.equals(sname)) {
                System.out.println("Name Found : "+name);
                break;
            }
        }

    }
}
