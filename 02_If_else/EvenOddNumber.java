import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even number  ");
            System.out.println("Abhay Weds Harsh");
        } else {
            System.out.println("Odd number  ");
            System.out.println("Arjun Weds Rudra ");
        }
        sc.close();
    }
}
