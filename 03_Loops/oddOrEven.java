import java.util.Scanner;
public class oddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even no.");
        } else {
            System.out.println(number + " is an odd no.");
        }

        scanner.close();
    }
}