import java.util.Scanner;

public class Increase_by_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (sequence[i] >= 0) {
                sequence[i] += 2;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(sequence[i] + " ");
        }
        scanner.close();
    }
}
