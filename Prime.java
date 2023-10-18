package demo_operators;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int n=0;
		String p=" ";
		for (i=1;i<=100;i++)         
		{ 		  	  
		int count=0; 	  
		for(n=i;n>=1;n--)
		{
		  if(i%n==0)
		  {
		   count=count+ 1;
		  }
		}
		  if (count==2)
		  {
		  p=p+i+" ";
		  }	
		}	
		System.out.println("Prime numbers from 0 to 100 are :"+"\n"+p);
	}

}
