import java.util.Scanner;
public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        if (n > 999 && n < 10000) {
            System.out.print("This is four digit number");
        } else {
            System.out.print("This is not four digit number");

        }
        sc.close();
    }
}
