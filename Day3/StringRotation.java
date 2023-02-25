package Day3;

public class StringRotation {
	
	static boolean strRot(String str1, String str2) {
		if(str1.length()!=str2.length())
			return false;
		String str3 = str1 + str1;
		if(str3.contains(str2))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		String str1 = "qwerer";
		String str2 = "rqwere";
		System.out.println(strRot(str1, str2));

	}

}
