
import java.util.Scanner;

public class The_ratio_of_product_to_the_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        long sum = 0;
        long product = 1;
        long temp = n;

        while (temp > 0) {
            long digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        double ratio = (double) product / sum;
        System.out.printf("%.3f%n", ratio);
    }
}
