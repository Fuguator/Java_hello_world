import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t1 = scanner.nextDouble();
        double t2 = scanner.nextDouble();
        double t3 = scanner.nextDouble();
        scanner.close();

        double result = 1 / (1/t1 + 1/t2 + 1/t3);
        System.out.printf("%.2f\n", result);
    }
}