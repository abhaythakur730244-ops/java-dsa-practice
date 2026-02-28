import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
System.out.print("Enter Number :");
int n = sc.nextInt();
if(n%5==0){
    System.out.print("The number is divible by 5");
}
else{
    System.out.print("The number is not divible by 5");
}
sc.close();
    }
}
