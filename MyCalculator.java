package week1.day2;

public class MyCalculator {

	int num1;
	int num2;
	int num3;
	int sum;

	public void add()

	{
		num1 = 10;
		num2 = 10;
		num3 = 10;
		sum = num1 + num2 + num3;
		System.out.println("sum of numbers  " + sum);

	}

	public void sub() {
		num1 = 15;
		num2 = 10;
		sum = num1 - num2;
		System.out.println("subraction of numbers  " + sum);
	}

	public void mul() {
		num1 = 10;
		num2 = 4;
		sum = num1 * num2;
		System.out.println("multiplication of numbers  " + sum);
	}

	public void div() {
		num1 = 50;
		num2 = 10;
		sum = num1 / num2;
		System.out.println("division of numbers  " + sum);

	}

	public static void main(String[] args) {

		MyCalculator calc = new MyCalculator();
		MyCalculator calc1 = new MyCalculator();
		MyCalculator calc2 = new MyCalculator();
		MyCalculator calc3 = new MyCalculator();
		calc.add();
		calc1.sub();
		calc2.mul();
		calc3.div();

	}

}
