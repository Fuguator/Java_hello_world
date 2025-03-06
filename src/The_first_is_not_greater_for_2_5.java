import java.util.Scanner;

public class The_first_is_not_greater_for_2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] <= 2.5) {
                System.out.printf("%d %.2f\n", i + 1, array[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
        scanner.close();
    }
}
