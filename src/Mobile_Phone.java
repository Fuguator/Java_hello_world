import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Mobile_Phone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine().replaceAll("\\D", ""); // Remove non-digit characters
        scanner.close();

        Set<Character> digits = new HashSet<>();
        for (char c : phoneNumber.toCharArray()) {
            digits.add(c);
        }

        int missingCount = 0;
        StringBuilder missingDigits = new StringBuilder();
        for (char c = '0'; c <= '9'; c++) {
            if (!digits.contains(c)) {
                missingCount++;
                missingDigits.append(c).append(" ");
            }
        }

        System.out.println(missingCount);
        System.out.println(missingDigits.toString().trim());
    }
}