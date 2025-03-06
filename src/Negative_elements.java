import java.util.Scanner;

public class Negative_elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }
        
        int negativeCount = 0;
        double negativeSum = 0.0;
        
        for (double num : numbers) {
            if (num < 0) {
                negativeCount++;
                negativeSum += num;
            }
        }
        
        System.out.printf("%d %.2f%n", negativeCount, negativeSum);
        
        scanner.close();
    }
}
