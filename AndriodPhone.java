package week3.day1;

public class AndriodPhone extends Mobile{

	public void takeVideo() {
		// takeVideo
		System.out.println("Taken Video from Andriod Phone");

	}
	public static void main(String[] args) {
		AndriodPhone andriod= new AndriodPhone();
		andriod.takeVideo();
		
		//Mobile class methods
		andriod.sendMsg();
		andriod.makeCall();
		andriod.saveContact();
		
	}

	}


