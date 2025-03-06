import java.util.Scanner;

public class The_sum_of_the_largest_and_the_smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int smallest = array[0];
        int largest = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        int sum = smallest + largest;

        System.out.println(sum);
        scanner.close();
    }
}
