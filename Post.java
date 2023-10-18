package demo_operators;

public class Post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		
		int preInc=++a;
		a=2;
		int postInc=a++;
		a=2;
		int preDec=--a;
		a=2;
		int postDec=a--;
		
		System.out.println(preInc);
		System.out.println(postInc);
		System.out.println(preDec);
		System.out.println(postDec);
	}

}
