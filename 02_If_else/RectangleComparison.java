import java.util.Scanner;

public class RectangleComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Take input for length and breadth
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        // 2. Calculate Area and Perimeter
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        // 3. Compare and display the result
        if (area > perimeter) {
            System.out.println("The Area is greater than the Perimeter.");
        } else if (perimeter > area) {
            System.out.println("The Perimeter is greater than the Area.");
        } else {
            System.out.println("The Area and Perimeter are equal.");
        }
        
        sc.close();
    }
}
