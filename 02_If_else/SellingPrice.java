import java.util.Scanner;

public class SellingPrice {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price : ");
        int cp = sc.nextInt();
        System.out.print("Enter the selling price : ");
        int sp = sc.nextInt();
        if (sp > cp) {
            System.out.println("Profit " + (sp - cp));
        } else if (cp > sp)
            System.out.println("Lose " + (sp - cp));
        else
            System.out.println("No profit No lose ");
        sc.close();
    }
}
