import java.util.Scanner;

public class ex7 {

    public static StringBuilder reverse(StringBuilder string) {
        StringBuilder reversed_ver = new StringBuilder();

        for (int i =string.length() - 1; i >= 0; i--) {
            reversed_ver.append(string.charAt(i));
        }
        return reversed_ver;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string: ");
        StringBuilder a = new StringBuilder(sc.nextLine());

        StringBuilder reversed = reverse(a);

        System.out.println("Reversed string: " + reversed);

    }
}