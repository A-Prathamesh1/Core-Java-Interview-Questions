import java.util.Scanner;

public class Pallindrome {

    public static boolean isPallindrome(String str){
        boolean result = true;
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.nextLine();
        System.out.println(isPallindrome(str));
    }
}
