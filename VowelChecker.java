import java.util.Scanner;

public class VowelChecker {
    /**
     * Check if the given String contains a vowel or not
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string ");

        String str = sc.nextLine();
        sc.close();
        char ch1[] = str.toCharArray();

        for(char ch : ch1){

            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(ch + " is a vowel");
            }else{
                System.out.println(ch + " is not a vowel");
            }
        }
    }
}
