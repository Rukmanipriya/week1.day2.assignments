package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		int sum = calc.add(12, 12, 12);
		System.out.println("Sum of three numbers:"+ sum);

		int sub = calc.sub(30, 10);
		System.out.println("The Difference of two numbers: "+ sub);
		
		double mul = calc.mul(10, 10);
		System.out.println("The mul of two numbers: "+ mul);
		
		float divide = calc.divide(100, 10);
		System.out.println("The division of two numbers: "+ divide);
	}

}
