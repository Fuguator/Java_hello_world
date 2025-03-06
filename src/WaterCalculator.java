import java.util.Scanner;

public class WaterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result += i * 2;
        }
        System.out.println(result);
    }
}
