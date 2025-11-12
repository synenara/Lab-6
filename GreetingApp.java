import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class GreetingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String greeting = "Hello, " + name + "! You are " + age + " years old.";
        System.out.println(greeting);

        try {
            Files.writeString(Paths.get("greeting.txt"), greeting);
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }

        scanner.close();
    }
}
