import java.util.Scanner;

public class Number_of_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("[^a-zA-Z0-9]+");
        int count = 0;
        for (String word : words) {
            if (word.length() > 0) {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}