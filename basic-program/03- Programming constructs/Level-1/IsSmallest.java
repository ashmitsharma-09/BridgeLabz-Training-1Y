import java.util.Scanner;

public class IsSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3 :");
        int num3 = sc.nextInt();

        boolean Issmallest = (num1 < num2) && (num1 < num3);
        System.out.println("Is the first number the smallest ?" + Issmallest);

    }
}