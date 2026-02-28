import java.util.Scanner;
public class MagnitudeNumber {
public static void main(String[]args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the value : ");
     int n = sc.nextInt();
     if(Math.abs(n)<69){
        System.out.print("True ");
     }
     else {
                System.out.print(" False ");
     }
     sc.close();
}
}