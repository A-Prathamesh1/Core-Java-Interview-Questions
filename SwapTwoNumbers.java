import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Before a:" + a + " b " + b);
        //swap logic 1
        int c = 0;
        c = a;
        a = b;
        b = c;

        System.out.println("After a:" + a + " b " + b);

        //Swap logic 2
        a = b + a;//20 + 10 = 30
        b = a - b;//30 - 20 = 10
        a = a - b;//30 - 10 = 20

        System.out.println("again after swapping a" + a + " b:" + b);
    }
}
