package demo_operators;
import java.util.*;

public class Displaytwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Input first number: ");
	        int firstNumber = scanner.nextInt();

	        System.out.print("Input second number: ");
	        int secondNumber = scanner.nextInt();

	        int product = firstNumber * secondNumber;

	        System.out.println(product);

	        scanner.close();
	}

}
