package week3.day1;

public class Desktop extends Computer{

	public void desktopSize() {
		// desktopSize
System.out.println("Inside Desktop Class- Desktop size is 14 inch");

	}
	
	public static void main(String[] args) {
		System.out.println("Single Inheritance");
		Desktop des= new Desktop();
		des.computerMode();
		des.desktopSize();
	}
	
	
}
