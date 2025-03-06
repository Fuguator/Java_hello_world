import java.util.Scanner;

public class Number_of_words2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.trim().split("\\s+");
        System.out.println(words.length);
    }
}
