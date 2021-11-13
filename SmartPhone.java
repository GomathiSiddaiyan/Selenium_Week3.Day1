package week3.day1;

public class SmartPhone extends AndriodPhone{

	public void connectWhatsApp() {
		// connectWhatsApp
		System.out.println("Connect WhatsApp");

	}
	public void takeVideo() {
		// takeVideo
		System.out.println("Taken Video from Smart Phone");

	}
	public static void main(String[] args) {
		SmartPhone sp= new SmartPhone();
		sp.connectWhatsApp();
		//Smart phone class method
		sp.takeVideo();
		
		
		
	}
	}


