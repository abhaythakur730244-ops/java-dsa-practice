import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Principle :");
        double p = sc.nextInt();
        System.out.print("Enter a Rate :");
        double r = sc.nextInt();
        System.out.print("Enter a Time :");
        double t = sc.nextInt();
        double si = p * r * t / 100;
        System.out.print(si);
    }
}
