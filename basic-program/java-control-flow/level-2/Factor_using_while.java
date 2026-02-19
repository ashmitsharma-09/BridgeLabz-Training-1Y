import java.util.Scanner;

public class Factor_using_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("Enter positive integer please");
        } else {
            System.out.println("Factors of " + a + " are:");

            int i = 1;   // counter

            while (i < a) {
                if (a % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}