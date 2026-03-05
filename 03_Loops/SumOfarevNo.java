import java.util.Scanner;
public class SumOfarevNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int r;
        int sum=0;
        while (n != 0) {
             
            r = n % 10;
            sum = sum + r;
            System.out.print(r);
            n = n /= 10;
             
        }
        System.out.println();
                System.out.println("sum = "+ sum);

        sc.close();
    }
}


