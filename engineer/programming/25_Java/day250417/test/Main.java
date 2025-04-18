package day250417.test;

public class Main {
    public static void main(String[] args) {
        // int a = 4;
        // int b = a;

        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        // // b = 6;
        // a = 7;

        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        int a[] = { 1, 2, 3 };
        int b[] = a;
        b[0] = 100;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
