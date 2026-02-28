import java.util.Scanner;
public class RealNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value :");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-x==0){
            System.out.println("It an integer");
        }
        else{
            System.out.println("Not an integer");
        }
        sc.close();
    }
}     
    
