package demo_operators;

		import java.util.Scanner;

		public class Marklist {

			public static void main(String[] args) {
				double total=300;
				Scanner obj=new Scanner(System.in);
				System.out.println("Enter Rollno:");
				int rno=obj.nextInt();
				System.out.println("Enter Student Name:");
				String name=obj.next();
				System.out.println("Mark1:");
				int m1=obj.nextInt();
				System.out.println("Mark2:");
				int m2=obj.nextInt();
				System.out.println("Mark3:");
				int m3=obj.nextInt();
				int sum=m1+m2+m3;
				System.out.println("Total Mark:"+sum);
				double percentage=(sum/total)*100;
				System.out.println("Percentage:"+percentage);
				if(percentage>=90)
				{
					System.out.println("GRADE IS : O");
				}
				else if(percentage>=70)
				{
					System.out.println("GRADE IS : A");
				}
				else if(percentage>=60)
				{
					System.out.println("GRADE IS : B");
				}
				else if(percentage>50)
				{
					System.out.println("GRADE IS : C");
				}
				else if(percentage>40)
				{
					System.out.println("GRADE IS : D");
				}
				else
				{
					System.out.println("Re-attempt");
				}
			    if(sum>=40)
				{
					System.out.println("Result : PASSED");
				}
				else
				{
					System.out.println("Result : FAILED");
				}

			}

	}
