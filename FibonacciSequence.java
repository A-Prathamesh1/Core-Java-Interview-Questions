import java.util.Scanner;

/*
* fibonacci sequence is where current number is sum of previous two numbers
* 0 1 1 2 3 5 8 13 ...
* */
public class FibonacciSequence {
    public static void printFibbo(int n){
        int first = 0;
        int second = 1;
        int third = 1;

        for(int i = 1; i <= n; i++){
            System.out.println(first + " ");
            third = first + second;
            second = first;
            first = third;
        }
    }
    public static int recFibbo(int n){
        if(n <= 1){
            return n;
        }else{
            return recFibbo(n - 1) + recFibbo(n - 2);
        }
    }
    public static void main(String[] args) {
        //Iterative fibonacci
//        printFibbo(10);

        //Recursive fibonacci
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++){
            System.out.println(recFibbo(i));
        }

    }
}
