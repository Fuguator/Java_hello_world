import java.util.Scanner;

public class Number_of_operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;
        for (int i = 1; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*') {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}