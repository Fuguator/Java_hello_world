import java.util.Scanner;

public class Sum_of_elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        double sum = 0.0;
        
        for (int i = 0; i < n; i++) {
            sum += scanner.nextDouble();
        }
        
        System.out.printf("%.1f\n", sum);
        scanner.close();
    }
}
