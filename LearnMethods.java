package week1.day2;

public class LearnMethods {

	public static void main(String[] args) {

		// ClassName objectName = new ClassName();
		LearnMethods obj = new LearnMethods();
		
		// obj.methodName();
		obj.printCarName();

		int CarRegNumber = obj.getCarRegNumber();
		System.out.println(CarRegNumber);

		String getCarVarient = obj.getCarVarient();
		System.out.println(getCarVarient);

		int multiply = obj.multiplyTwoNumbers(4, 3);
		System.out.println(multiply);
	}

	public void printCarName() {
		System.out.println("AUDI");
	}

	public int getCarRegNumber() {
		int CarRegNumber = 2018;
		return CarRegNumber;
	}

	public String getCarVarient() {
		return "Automatic";
	}

	public int multiplyTwoNumbers(int a, int b) {
		return a * b;
	}

}
