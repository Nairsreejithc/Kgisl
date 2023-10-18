package demo_operators;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int rno,bp;
		String name,desig;
		double DA,HRA,PF,GP,NP;

		System.out.println("enter the empno");
		rno=sc.nextInt();

		System.out.println("enter the empname");
		name=sc.next();

		System.out.println("enter the desig");
		desig=sc.next();

		System.out.println("enter the bp");
		bp=sc.nextInt();
		
		DA=bp*15/100;
		HRA=bp*16/100;
		PF=bp*20/100;
		
		GP=bp+DA+HRA;
		NP=GP-PF;
		
		
		System.out.println("DA - "+DA+"\n"+"HRA -"+HRA+"\n"+"PF -"+PF+"\n"+"GP -"+GP+"\n"+"NP -"+NP);
		
	}

}
