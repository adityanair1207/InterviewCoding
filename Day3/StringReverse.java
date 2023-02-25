package Day3;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		StringBuilder str = new StringBuilder(sc.next());
		str.reverse();
		System.out.println(str);
		
		String str2 = "";
		char chs[] = str.toString().toCharArray();
		for(int i=chs.length-1; i>=0; i--) {
			str2 = str2 + chs[i];
		}
		System.out.println(str2);

	}

}
