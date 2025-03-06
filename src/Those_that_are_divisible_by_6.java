import java.util.Scanner;

public class Those_that_are_divisible_by_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > 0 && num % 6 == 0) {
                count++;
                sum += num;
            }
        }
        System.out.println(count + " " + sum);
        scanner.close();
    }
}
