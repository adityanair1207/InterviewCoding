package Day2;

public class RevString {
	
	static void strRev(String str) {
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		
		strRev("I Love India");

	}

}
