import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // kitni line hogi...
            for (int j = 1; j <= n; j++) // har line ma kitna print hoga...
                System.out.print("* ");
            System.out.println();
        }
        sc.close();

    }
}