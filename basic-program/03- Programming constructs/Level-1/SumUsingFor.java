import java.util.Scanner;

public class SumUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        System.out.println("How many numbers you want to add?");
        int n = sc.nextInt();

        System.out.println("Enter numbers:");

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            total = total + a;
        }

        System.out.println("Sum = " + total);
        sc.close();
    }
}