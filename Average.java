package demo_operators;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		
		 System.out.print("Enter the first number: ");
	        double num1 = a.nextDouble();
	        System.out.print("Enter the second number: ");
	        double num2 = a.nextDouble();
	        System.out.print("Enter the third number: ");
	        double num3 = a.nextDouble();
	        
	        double average=(num1+num2+num3)/3;
	        System.out.println(average);
	}

}
