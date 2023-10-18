package demo_operators;
class Rev extends Thread
{
	public void run()
	{
		System.out.println("reverse a string");
		String s="java programming";
		for(int i=5;i<=10;i++)
		{
			System.out.println(s.charAt(i));
		}
			System.out.println("exit from thread rev");
		}
	}
	class Mul extends Thread
	{
		public void run()
		{
			int i,j,k=6;
			System.out.println("multiplication tebles");
			for (i=1;i<=10;i++)
			{
				j=i*k;
				System.out.println(i+"*"+k+"="+j);
			}
				System.out.println("exit from thread mul");
			}
		}
		class Oddeven extends Thread
		{
			public void run()
			{
				int i;
				System.out.println("printing 20 odd number");
				for(i=1;i<=20;i++)
				{
					if(i%2==0)
					{
						System.out.println("even number"+i);
					}
					else 
					{
						System.out.println("odd number"+i);
					}
				}
				System.out.println("exit from thread oddeven");
			}
		
		public static void main(String[] args) {
			Rev r = new Rev();
			Mul m = new Mul();
			Oddeven o = new Oddeven();
			
			r.start();
			m.start();
			o.start();
		}
}
