import java.util.Scanner;

public class Number_of_sentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] sentences = input.trim().split("[.!?]");
        System.out.println(sentences.length);
    }
}