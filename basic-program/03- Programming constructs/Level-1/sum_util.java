
import java.util.Scanner;

public class sum_util{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter num :");
        int a = sc.nextInt();
        double total = 0.0;
        while (a != 0){
            total = total + a ; 
            System.out.println("Enter 0 to exist the code ");
            a = sc.nextInt(); 
        }
        System.out.println(total);
    }    
}