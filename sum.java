import java.util.Scanner;

public class sum {
    public static int sumRecursive(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + sumRecursive(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int result = sumRecursive(numbers, 0);
        System.out.println("Sum: " + result);
        scanner.close();
    }
}