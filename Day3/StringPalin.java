package Day3;

import java.util.Scanner;

public class StringPalin {

	public static void main(String[] args) {
		
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				flag = 1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Not a palindrome");
		else
			System.out.println("Is a palindrome");

	}

}
