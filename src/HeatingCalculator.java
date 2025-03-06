import java.util.Scanner;

public class HeatingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int l = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(calculateBatteries(h, w, l, k));
    }

    public static int calculateBatteries(int h, int w, int l, int k) {
        long volume = (long) h * w * l;

        int batteries = (int) Math.ceil((double) volume / k);
        return batteries;
    }
}
