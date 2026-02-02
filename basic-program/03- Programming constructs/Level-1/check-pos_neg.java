
import java.util.Scanner;

public class check_pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num :");
        int a = sc.nextInt();

        if(a<0){
            System.out.println("Number is Negative");
        }
        else if (a>0){
            System.out.println("Number is postive");
        }
        else{
            System.out.println("Zero");
        }
    }
}