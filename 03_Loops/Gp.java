import java.util.Scanner;
public class Gp {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int r = 2;
        for(int i=1; i<=n; i++){
            System.out.println(a+"");
            a*=r;
        }
        sc.close();
    }
}
