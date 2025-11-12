import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            sum += scanner.nextInt();
        }

        double average = sum / 5.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}
