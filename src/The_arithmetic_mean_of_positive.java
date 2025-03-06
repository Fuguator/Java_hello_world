import java.util.Scanner;

public class The_arithmetic_mean_of_positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            double num = scanner.nextDouble();
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            double mean = sum / count;
            System.out.printf("%.2f\n", mean);
        } else {
            System.out.println("Not Found");
        }
        scanner.close();
    }
}
