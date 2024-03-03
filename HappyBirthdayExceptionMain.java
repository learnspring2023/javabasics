package wip;

//Create Custom Ex
class HappyBirthdayException extends Exception {
	HappyBirthdayException(String msg) {
		super(msg);
	}
}

class HappyBirthdayThanuException extends Exception {
	HappyBirthdayThanuException(String msg) {
		super(msg);
	}
}

public class HappyBirthdayExceptionMain {
	public static void main(String[] args) {
		//Date = 3 - Raise Custom HBD , No Exception
		int date = 13;
		try {
			if(date == 3) {
				throw new HappyBirthdayException("Happy B'Day Sinch and Rakshitha");
			}
			if(date == 13) {
				throw new HappyBirthdayThanuException("Happy B'Day Thanu");
			}
			System.out.println("Normal Boring day");
		} catch (Exception e) {
			System.out.println("HBD Exception raised");
			System.out.println(e.getMessage());
		}
	}
}
