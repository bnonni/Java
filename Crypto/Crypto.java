import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] alpha = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };
        int[] numeric = new int[] { 1, 2, 3, 4, 5, 6 };

        System.out.println("Enter a word you want to encrypt.");
        String word = input.nextLine();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            c = alpha[i];
            alpha[i] = c;
        }

    }
}