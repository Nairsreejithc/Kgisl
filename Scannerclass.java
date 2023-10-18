package demo_operators;
import java.util.Scanner;
public class Scannerclass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
				System.out.print("ENTER THE FIRST NUMBER: ");
			        int firstNumber = scan.nextInt();
			        
			        System.out.print("ENTER THE SECOND NUMBER: ");
			        int secondNumber = scan.nextInt();
			        
			        int sum = firstNumber + secondNumber;
			        System.out.println(sum);

			        scan.close();
	}

}
