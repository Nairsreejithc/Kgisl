package demo_operators;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {1,2,3,4,7,8,9};

	        int greatestNumber = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < greatestNumber) {
	                greatestNumber = numbers[i];
	            }
	        }

	        System.out.println(greatestNumber);
	}

}
