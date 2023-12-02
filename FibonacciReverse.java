import java.util.Scanner;

public class FibonacciReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        System.out.println("Reverse Fibonacci Series up to " + n + " numbers:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(Fibonacci(i) + " ");
        }

        scanner.close();
    }

    private static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
