import java.util.*;
import java.util.stream.*;

public class ProductFilter {

    static class Product {
        String name;
        double price;
        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Product> products = Arrays.asList(
            new Product("Laptop", 850.00),
            new Product("Mouse", 25.00),
            new Product("Keyboard", 55.00),
            new Product("Monitor", 120.00),
            new Product("USB Cable", 15.00)
        );

        System.out.print("Enter price threshold: ");
        double threshold = input.nextDouble();

        List<Product> expensive = products.stream()
                                          .filter(p -> p.price > threshold)
                                          .toList(); 

        System.out.println("\nProducts over " + threshold + ":");
        expensive.forEach(p -> System.out.println("- " + p.name + ": $" + p.price));

        System.out.println("\nTotal expensive products: " + expensive.size());

        input.close();
    }
}
