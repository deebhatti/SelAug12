package demo;

public class Calculator {

	public void add(int a, int b) { // a and b are called as Formal Parameters
		System.out.println(a + b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Calculator basicCal = new Calculator();

		basicCal.add(10, 20); // Calling or Invoking the add method
		basicCal.subtract(50, 10); // 50 and 10 are called as Actual Parameters
		basicCal.multiply(10, 20);
		basicCal.divide(1000, 200);

	}

}
