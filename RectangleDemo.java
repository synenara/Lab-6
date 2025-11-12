import java.util.Scanner;

public class RectangleDemo {

    static class Rectangle {
        double length, width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        double calculateArea() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = input.nextDouble();

        System.out.print("Enter the width: ");
        double width = input.nextDouble();

        Rectangle rect = new Rectangle(length, width);
        System.out.println("Area of the rectangle: " + rect.calculateArea());

        input.close();
    }
}
