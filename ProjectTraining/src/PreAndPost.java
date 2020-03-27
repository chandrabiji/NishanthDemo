public class PreAndPost {

    public static void main(String[] args) {
        System.out.println("---Pre-Increment--");
        int a = 5;
        System.out.println("A = "+a);//5
        int b = ++a;//b = a+1;
        System.out.println("B = "+b);//6
        System.out.println("A = "+a);//6
        System.out.println("--Post Increment---");
        int x = 6;
        System.out.println("X = "+x);//6
        int y = x++;
        System.out.println("Y = "+y);//6
        System.out.println("X = "+x);//7
        System.out.println("--Pre Decrement--");
        int p=8;
        System.out.println("P = "+p);//8
        int q = --p;
        System.out.println("Q = "+q);//7
        System.out.println("P = "+p);//7
        System.out.println("--Post Decrement---");
        int m = 9;
        System.out.println("M = "+m);//9
        int n = m--;
        System.out.println("N = "+n);//9
        System.out.println("M = "+m);//8

    }

}
