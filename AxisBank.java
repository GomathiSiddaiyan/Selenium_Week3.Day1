package week3.day1;

public class AxisBank {

	public void deposit() {
		// deposit
		double dep=8000;
		System.out.println("Deposit Amount:"+dep);

	}
	public static void main(String[] args) {
		AxisBank Ab= new AxisBank();
		System.out.println("To override the method deposit in AxisBank");
		Ab.deposit();
	}
}
