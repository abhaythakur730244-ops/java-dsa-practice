import java.util.Scanner;
public class PowerLoop {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of a : ");
    int a = sc.nextInt();
     System.out.print("Enter the number of b : ");
    int b = sc.nextInt();
int pow = 1;
for(int i=1;i<=b;i++){
    pow *= a;
}
System.out.println( pow );
sc.close();
   } 
}
