import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String line = sc.nextLine();
        sc.close();

        char[] ch = line.toCharArray();

        for(int i = ch.length - 1; i >= 0; i--){
            System.out.print(ch[i]);
        }
    }
}
