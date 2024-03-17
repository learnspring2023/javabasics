package loops;

public class Operators {
	public static void main(String[] args) {
		int x = 10;
		String result = "";
		if (x>1) {
			result = "BIG";
		} else {
			result = "SMALL";
		}
		//ternary operation
		String result1 = x>1? "BIG" : "SMALL";
		
		System.out.println(result);
		System.out.println(result1);
	}

}
