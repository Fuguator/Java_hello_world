import java.util.Scanner;

public class AnfisaCheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextInt();
        long n = scanner.nextInt();
        scanner.close();

        long result = (m - 1) * (n - 1) + 1;
        System.out.println(result);
    }
}