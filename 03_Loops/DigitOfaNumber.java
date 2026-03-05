import java.util.Scanner;

public class DigitOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n==0) n=1;
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println(count);
        sc.close();

    }
}
