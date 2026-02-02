import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int fact = 1;
            int i = 1;

            while (i <= n) {
                fact = fact * i;
                i++;
            }

            System.out.println("Factorial of " + n + " is " + fact);
        }
    }
}