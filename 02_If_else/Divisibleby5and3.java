import java.util.Scanner;

public class Divisibleby5and3 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(" The number is divisible by 5... and 3... ");
            System.out.println("Rudraa... ");

        } else if (n % 3 == 0) {
            System.out.println("The number is  divisible by  3... ");
            System.out.println("Arjun... ");

        } else if (n % 5 == 0) {
            System.out.println("The number is  divisible by  5... ");
            System.out.println("Harsh... ");

        } else {
            System.out.println("The number is not divisible by  5... and 3... ");
            System.out.println("Lakshya... ");
        }
        sc.close();
    }
}
