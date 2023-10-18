package demo_operators;
class Hello{
	int n,fact=1;
	void setValue(int a)
	{
		n=a; 
	}
	int getValue()
	{
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
}
public class Factorial {
	public static void main(String[] args) {
		Hello e=new Hello();
		
	
		
	e.setValue(10);
	int f = e.getValue();
	System.out.println(f);
	
}
}
