import java.util.Scanner;

public class Print_No {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int a = sc.nextInt();
        if (a<=0){
            System.out.println("Not a natural number");
        }else {
            for (int i = 1 ; i <=a ; i++){
                if (i % 2 == 0){
                    System.out.println(i + " is even");
                }
                else {
                    System.out.println(i + " is odd");
                }
            }
        }
    }
}