import java.util.Scanner;

public class SimpleProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int tens = num / 10;
        int ones = num % 10;
        System.out.println(tens + " " + ones);
        scanner.close();
    }
}
