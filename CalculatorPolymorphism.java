package week3.day1;

public class CalculatorPolymorphism {

	public void add(int num1, int num2)
	{
		int add= num1+num2;
		System.out.println("Addition with 2 int arg passing: "+add);
	}
	public void add(int num1, int num2, int num3)
	{
		int add= num1+num2+num3;
		System.out.println("Addition with 3 int arg passing: "+add);
	}
	public void mul(int num1, int num2)
	{
		int mul= num1*num2;
		System.out.println("Multiplication with 2 int arg passing: "+mul);
	}
	public void mul(int num1, double num2)
	{	
		double mul= num1*num2;
		System.out.println("Multiplication with 1 int and 1 double arg passing: "+mul);
	}
	public void sub(int num1, int num2)
	{	int sub=num1-num2;
		System.out.println("Subtraction with 2 int arg passing: "+sub);
	}
	public void sub(double num1, double num2)
	{	double sub=num1-num2;
		System.out.println("Subtraction with 2 double arg passing: "+sub);
	}
	public void div(int num1, int num2)
	{	int div=num1/num2;
		System.out.println("Divide with 2 int arg passing: "+div);
	}
	public void div(double num1, int num2)
	{	double div=num1/num2;
		System.out.println("Divide with 2 int arg passing: "+div);
	}
	public static void main(String[] args) {
		// Polymorphism
		System.out.println("Polymorphism program");
		CalculatorPolymorphism cal= new CalculatorPolymorphism();
		cal.add(5, 10);
		cal.add(1, 2, 3);
		cal.mul(5, 5);
		cal.mul(5, 5.5);
		cal.sub(10, 5);
		cal.sub(10.5, 20.5);
		cal.div(10, 5);
		cal.div(10.5, 10);

	}
}
