import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int a = 0;
        for (int i = 2; i <=Math.sqrt (n) ; i++) {
            if (n % i == 0) {
                a = 1;
                break;
            }
        }
        if (n == 1)
            System.out.println("1 is neither prime nor composite...");
        else if (a == 0)
            System.out.println("The number is prime... ");
        else
            System.out.println("The number is composite... ");
        sc.close();
    }

}
