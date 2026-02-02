
import java.util.Scanner;

public class SumOfNatural_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int a = sc.nextInt();

        if(a<=0){
            System.out.println("Number is not a natural number ");
            return;
        }
        int sumfor = 0;
        for(int  i = 1 ; i <= a ; i++){
            sumfor = sumfor + i ;
        }

        int sumFormula = a * (a + 1)/2 ;
        System.out.println("Sum using while loop   = " + sumfor);
        System.out.println("Sum using formula      = " + sumFormula);

        if (sumfor == sumFormula) {
            System.out.println("Result is correct. Both computations are equal.");
        } else {
            System.out.println("Result is incorrect. Computations are not equal.");
        }
    }
}