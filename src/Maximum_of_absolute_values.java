import java.util.Scanner;

public class Maximum_of_absolute_values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double maxAbsoluteValue = 0.0;

        for (int i = 0; i < n; i++) {
            double value = scanner.nextDouble();
            double absoluteValue = Math.abs(value);
            if (absoluteValue > maxAbsoluteValue) {
                maxAbsoluteValue = absoluteValue;
            }
        }

        System.out.printf("%.2f\n", maxAbsoluteValue);
        
        scanner.close();
    }
}
