package demo_operators;

public class LOgical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=2;
		boolean AND = (a > b) && (b < a);
        System.out.println(AND);

        boolean OR = (a < b) || (b < a);
        System.out.println(OR);

        boolean NOT = !(a != b);
        System.out.println(NOT);

	}

}
