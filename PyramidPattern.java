package demo_operators;
import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int height = input.nextInt();

        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <=  i - 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
