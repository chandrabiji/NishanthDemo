package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicSingleDimArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer array size ?");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Elements ?");
        for(int i=0;i<size;++i)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are :");
        for(int k:arr)
        {
            System.out.println(k);
        }
        Arrays.sort(arr);//array elements sorting automatically
        System.out.println("After sorting Array Elements :");
        for(int k:arr)
        {
            System.out.println(k);
        }
        System.out.println("Array Maximum Element : "+arr[size-1]);
        System.out.println("Array Minimum Element : "+arr[0]);
        System.out.println("Array 2nd Highest Element : "+arr[size-2]);

    }
}
