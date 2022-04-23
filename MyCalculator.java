package week1.day2;
import week1.day2.Calculator;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		
		int sum = obj.add(7, 4, 9);
		System.out.println("      Calculator Results\n");		
		System.out.println("Sum is " + sum + "\n");
		
		int subract = obj.sub(8, 2);
		System.out.println("Subraction is " + subract + "\n");
		
		double multiply = obj.mul(4, 6);
		System.out.println("Multiple is " + multiply + "\n");
		
		float divide1 = obj.divide(15, 5);
		System.out.println("Divide is " + divide1 + "\n");

	}

}
