import java.util.Scanner;

public class FindMultiplesBelow100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive number less than 100");
        } else {
            int counter = number - 1;

            System.out.println("Multiples (factors) of " + number + " are:");

            while (counter > 1) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
    }
}