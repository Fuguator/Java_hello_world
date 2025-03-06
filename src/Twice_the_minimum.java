import java.util.Scanner;
import java.util.Arrays;

public class Twice_the_minimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }

        double minElement = Arrays.stream(array).min().getAsDouble();

        double result = 2 * minElement;

        System.out.printf("%.2f%n", result);
        scanner.close();
    }
}
