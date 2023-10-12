import java.util.Scanner;

public class PrimeNumberOrNot {
    public static boolean isPrime(int num){
        if(num <= 1){
            System.out.println("Not a prime number");
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        sc.close();

        if(isPrime(num)){
            System.out.println(num + " is prime");
        }else{
            System.out.println(num + " is not prime");
        }
    }
}
